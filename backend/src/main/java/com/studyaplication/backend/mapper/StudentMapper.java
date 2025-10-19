package com.studyaplication.backend.mapper;

import com.studyaplication.backend.dto.request.StudentRequestDTO;
import com.studyaplication.backend.dto.response.StudentResponseDTO;
import com.studyaplication.backend.model.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(StudentRequestDTO dto);

    StudentResponseDTO toDto(Student entity);
}
