package com.studyaplication.backend.controller;

import com.studyaplication.backend.dto.request.WorkspaceRequestDTO;
import com.studyaplication.backend.dto.response.WorkspaceResponseDTO;
import com.studyaplication.backend.mapper.WorkspaceMapper;
import com.studyaplication.backend.model.Workspace;
import com.studyaplication.backend.service.WorkspaceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workspaces")
public class WorkspaceController {

    private final WorkspaceService service;
    private final WorkspaceMapper mapper;

    public WorkspaceController(WorkspaceService service, WorkspaceMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<WorkspaceResponseDTO> save(@RequestBody WorkspaceRequestDTO request){
        Workspace entity = mapper.toEntity(request);
        service.save(entity);
        return ResponseEntity.ok(mapper.toDto(entity));
    }

}
