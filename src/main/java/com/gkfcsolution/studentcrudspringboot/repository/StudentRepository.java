package com.gkfcsolution.studentcrudspringboot.repository;

import com.gkfcsolution.studentcrudspringboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2025 at 15:46
 * File: null.java
 * Project: studentCrudSpringboot
 *
 * @author Frank GUEKENG
 * @date 14/10/2025
 * @time 15:46
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
