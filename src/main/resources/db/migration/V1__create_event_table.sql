
CREATE TABLE Events(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    start_at TIMESTAMP NOT NULL,
    end_at TIMESTAMP NOT NULL,
    capacity INTEGER NOT NULL,
    event_local VARCHAR(255) NOT NULL,
    organizer VARCHAR(255),
    event_identity VARCHAR(255) NOT NULL UNIQUE,
    event_type VARCHAR(50) NOT NULL
)