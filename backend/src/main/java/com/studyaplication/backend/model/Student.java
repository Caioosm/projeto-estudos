package com.studyaplication.backend.model;

import com.studyaplication.backend.model.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "student",
        schema = "public")
@Getter @Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String username;

    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    // Workspace
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Workspace> workspace;

    public Student() {}
}
