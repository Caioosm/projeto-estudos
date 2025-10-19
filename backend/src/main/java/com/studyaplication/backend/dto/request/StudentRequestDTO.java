package com.studyaplication.backend.dto.request;

public record StudentRequestDTO(
        String name,
        String username,
        String password,
        String email
){}
