package com.studyaplication.backend.service;

import com.studyaplication.backend.model.Workspace;
import com.studyaplication.backend.repository.WorkspaceRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class WorkspaceService {

    private final WorkspaceRepository repository;

    public WorkspaceService(WorkspaceRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void save(Workspace workspace){
        repository.save(workspace);
    }

}
