package com.studyaplication.backend.controller;

import com.studyaplication.backend.dto.request.StudentRequestDTO;
import com.studyaplication.backend.dto.response.StudentResponseDTO;
import com.studyaplication.backend.mapper.StudentMapper;
import com.studyaplication.backend.model.Student;
import com.studyaplication.backend.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;
    private final StudentMapper mapper;

    public StudentController(StudentService service, StudentMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<StudentResponseDTO> save(@RequestBody StudentRequestDTO request) {
        Student entity = mapper.toEntity(request);
        service.save(entity);
        return ResponseEntity.ok(mapper.toDto(entity));
    }
}
