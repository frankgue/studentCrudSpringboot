package com.gkfcsolution.studentcrudspringboot;

import com.gkfcsolution.studentcrudspringboot.entity.Student;
import com.gkfcsolution.studentcrudspringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentCrudSpringbootApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentCrudSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student1 = Student.builder()
                .firstName("Frank")
                .lastName("GUEKENG")
                .email("frankgue@gmail.com")
                .build();
        Student student2 = Student.builder()
                .firstName("Cabrel")
                .lastName("KUETI")
                .email("cabrelkueti@gmail.com")
                .build();
        Student student3 = Student.builder()
                .firstName("ludo")
                .lastName("JONGO")
                .email("ludojongo@gmail.com")
                .build();

//        studentRepository.saveAll(List.of(student1,student2,student3));

    }
}
