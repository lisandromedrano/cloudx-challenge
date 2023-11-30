CREATE TABLE app_info (
    id SERIAL PRIMARY KEY,
    kind VARCHAR(50) NOT NULL,
    name VARCHAR(100) NOT NULL,
    api_version VARCHAR(200) NOT NULL,
    namespace VARCHAR(100) NOT NULL
);