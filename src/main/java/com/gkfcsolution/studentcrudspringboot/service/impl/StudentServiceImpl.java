package com.gkfcsolution.studentcrudspringboot.service.impl;

import com.gkfcsolution.studentcrudspringboot.entity.Student;
import com.gkfcsolution.studentcrudspringboot.repository.StudentRepository;
import com.gkfcsolution.studentcrudspringboot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2025 at 15:52
 * File: null.java
 * Project: studentCrudSpringboot
 *
 * @author Frank GUEKENG
 * @date 14/10/2025
 * @time 15:52
 */
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
