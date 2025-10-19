package com.studyaplication.backend.service;

import com.studyaplication.backend.model.Student;
import com.studyaplication.backend.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void save(Student student) {
       repository.save(student);
    }
}
