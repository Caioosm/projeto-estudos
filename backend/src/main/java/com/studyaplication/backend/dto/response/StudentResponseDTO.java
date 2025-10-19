package com.studyaplication.backend.dto.response;

import com.studyaplication.backend.model.enums.Role;

public record StudentResponseDTO(
        String name,
        String username,
        String email,
        Role role
) {}
