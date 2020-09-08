package ru.rdude.simpleStore.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Product {

    @EqualsAndHashCode.Include
    @JsonProperty("uuid")
    protected UUID uuid;
    @JsonProperty("name")
    protected String name;
    @JsonProperty("price")
    protected double price;

}
