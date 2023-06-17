package com.wow.PracticaSi.service;
import com.wow.PracticaSi.entity.Course;
import com.wow.PracticaSi.entity.Grade;
import com.wow.PracticaSi.dao.GradeDao;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private final GradeDao gradeDao;

    public GradeServiceImpl(GradeDao gradeDao) {
        this.gradeDao = gradeDao;
    }

    @Override
    public List<Grade> findAllGrades() {
        return (List<Grade>) gradeDao.findAll();
    }

    @Override
    public Grade findGradeById(Long id) {
        Optional<Grade> optionalGrade = gradeDao.findById(id);
        // Handle the case when the grade is not found...
        return optionalGrade.orElse(null);
    }

    @Override
    public Grade createGrade(Grade grade) {
        return gradeDao.save(grade);
    }

    @Override
    public List<Grade> findGradesByStudentId(Long studentId) {
        return gradeDao.findByStudentId(studentId);
    }

    @Override
    public List<Grade> findGradesByStudentIdAndCourseId(Long studentId, Long courseId) {
        return gradeDao.findByStudentIdAndCourseId(studentId, courseId);
    }
}
