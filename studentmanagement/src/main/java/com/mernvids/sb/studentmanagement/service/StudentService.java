package com.mernvids.sb.studentmanagement.service;

import com.mernvids.sb.studentmanagement.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Optional<Student> getStudentByEmail(String email);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}

