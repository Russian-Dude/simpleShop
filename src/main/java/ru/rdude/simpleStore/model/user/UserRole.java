package ru.rdude.simpleStore.model.user;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserRole {
    ADMIN,
    MODERATOR,
    USER;

    @JsonValue
    public String getName() {
        return name();
    }
}
