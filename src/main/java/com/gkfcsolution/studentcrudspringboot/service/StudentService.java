package com.gkfcsolution.studentcrudspringboot.service;

import com.gkfcsolution.studentcrudspringboot.entity.Student;

import java.util.List;

/**
 * Created on 2025 at 15:51
 * File: null.java
 * Project: studentCrudSpringboot
 *
 * @author Frank GUEKENG
 * @date 14/10/2025
 * @time 15:51
 */
public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
