package com.wow.PracticaSi.service;
import com.wow.PracticaSi.entity.Student;
import com.wow.PracticaSi.dao.StudentDao;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentDao studentDao;


    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAllStudents() {
        return (List<Student>) studentDao.findAll();
    }

    @Override
    public Student findStudentById(Long id) {
        Optional<Student> optionalStudent = studentDao.findById(id);
        // Handle the case when the student is not found...
        return optionalStudent.orElse(null);
    }

    @Override
    public Student createStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        // Handle the case when the student is not found...
        Student existingStudent = findStudentById(id);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        return studentDao.save(existingStudent);
    }

    @Override
    public void deleteStudent(Long id) {
        studentDao.deleteById(id);
    }
}
