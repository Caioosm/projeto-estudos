CREATE TABLE student (
    id uuid PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(72) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    role VARCHAR(50) NOT NULL DEFAULT 'USER',

    CONSTRAINT chk_role CHECK ( role IN ('USER'))
);