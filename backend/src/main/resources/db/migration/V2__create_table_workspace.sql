CREATE TABLE workspace (
    id uuid PRIMARY KEY,
    title VARCHAR(100),
    student_id uuid,
    created_date TIMESTAMP,
    updated_date TIMESTAMP,
    CONSTRAINT FK_student_id FOREIGN KEY (student_id) REFERENCES student(id)
);
