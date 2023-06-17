package com.wow.PracticaSi.service;
import com.wow.PracticaSi.entity.Course;
import java.util.List;

public interface CourseService {
    List<Course> findAllCourses();
    Course findCourseById(Long id);
    Course createCourse(Course course);
    Course updateCourse(Long id, Course course);
    void deleteCourse(Long id);
}