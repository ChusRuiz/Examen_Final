package com.wow.PracticaSi.dao;
import com.wow.PracticaSi.entity.Grade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeDao extends CrudRepository<Grade, Long> {
    List<Grade> findByStudentId(Long studentId);
    List<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId);
}
