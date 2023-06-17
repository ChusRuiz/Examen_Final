package com.wow.PracticaSi.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.wow.PracticaSi.entity.Student;
@Repository
public interface StudentDao extends CrudRepository<Student, Long> {
}
