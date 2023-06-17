package com.wow.PracticaSi.controllers;
import com.wow.PracticaSi.entity.Grade;
import com.wow.PracticaSi.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {

    @Autowired
    GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping
    public List<Grade> getAllGrades() {
        return gradeService.findAllGrades();
    }

    @PostMapping
    public Grade createGrade(@RequestBody Grade grade) {
        return gradeService.createGrade(grade);
    }

    @GetMapping("/student/{studentId}")
    public List<Grade> getGradesByStudentId(@PathVariable Long studentId) {
        return gradeService.findGradesByStudentId(studentId);
    }

    @GetMapping("/student/{studentId}/course/{courseId}")
    public List<Grade> getGradesByStudentIdAndCourseId(@PathVariable Long studentId, @PathVariable Long courseId) {
        return gradeService.findGradesByStudentIdAndCourseId(studentId, courseId);
    }
}
