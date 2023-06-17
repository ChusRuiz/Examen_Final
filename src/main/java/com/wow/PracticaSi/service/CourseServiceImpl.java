package com.wow.PracticaSi.service;
import com.wow.PracticaSi.entity.Course;
import com.wow.PracticaSi.dao.CourseDao;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private final CourseDao courseDao;


    public CourseServiceImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Course> findAllCourses() {
        return (List<Course>) courseDao.findAll();
    }

    @Override
    public Course findCourseById(Long id) {
        Optional<Course> optionalCourse = courseDao.findById(id);
        // Handle the case when the course is not found...
        return optionalCourse.orElse(null);
    }

    @Override
    public Course createCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Long id, Course course) {
        // Handle the case when the course is not found...
        Course existingCourse = findCourseById(id);
        existingCourse.setTitle(course.getTitle());
        existingCourse.setDescription(course.getDescription());
        return courseDao.save(existingCourse);
    }

    @Override
    public void deleteCourse(Long id) {
        courseDao.deleteById(id);
    }
}

