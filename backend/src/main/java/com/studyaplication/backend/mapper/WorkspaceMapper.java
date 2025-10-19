package com.studyaplication.backend.mapper;

import com.studyaplication.backend.dto.request.WorkspaceRequestDTO;
import com.studyaplication.backend.dto.response.WorkspaceResponseDTO;
import com.studyaplication.backend.model.Workspace;
import com.studyaplication.backend.repository.StudentRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", uses = {StudentMapper.class})
public abstract class WorkspaceMapper {

    @Autowired
    StudentRepository repository;

    @Mapping(target = "student", expression = "java( repository.findById(dto.studentId()).orElse(null) )")
    public abstract Workspace toEntity(WorkspaceRequestDTO dto);

    public abstract WorkspaceResponseDTO toDto(Workspace entity);
}
