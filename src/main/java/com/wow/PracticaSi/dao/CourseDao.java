package com.wow.PracticaSi.dao;
import org.springframework.stereotype.Repository;
import com.wow.PracticaSi.entity.Course;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CourseDao extends CrudRepository<Course, Long> {
}
