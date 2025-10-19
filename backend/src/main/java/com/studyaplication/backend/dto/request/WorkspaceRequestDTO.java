package com.studyaplication.backend.dto.request;

import java.util.UUID;

public record WorkspaceRequestDTO(
        String title,
        UUID studentId
) {
}
