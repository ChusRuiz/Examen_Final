package com.wow.PracticaSi.service;
import com.wow.PracticaSi.entity.Grade;
import java.util.List;

public interface GradeService {
    List<Grade> findAllGrades();
    Grade findGradeById(Long id);
    Grade createGrade(Grade grade);
    List<Grade> findGradesByStudentId(Long studentId);
    List<Grade> findGradesByStudentIdAndCourseId(Long studentId, Long courseId);
}
