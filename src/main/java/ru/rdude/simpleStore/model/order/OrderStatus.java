package ru.rdude.simpleStore.model.order;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatus {
    CREATED,
    PAYED,
    RECEIVED,
    CANCELED;

    @JsonValue
    public String getName() {
        return name();
    }
}
