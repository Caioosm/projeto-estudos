package com.studyaplication.backend.dto.response;

import com.studyaplication.backend.model.Student;

import java.util.UUID;

public record WorkspaceResponseDTO(
        UUID id,
        String title,
        Student student
) {
}
