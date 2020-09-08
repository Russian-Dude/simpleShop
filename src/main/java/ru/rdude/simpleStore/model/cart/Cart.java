package ru.rdude.simpleStore.model.cart;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.rdude.simpleStore.model.product.Product;
import ru.rdude.simpleStore.model.promo.Promo;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Data
public class Cart {

    @JsonProperty("products")
    private List<ProductEntity> products;

    @JsonProperty("promos")
    private Set<Promo> promos;

    @Data
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    public class ProductEntity {

        @EqualsAndHashCode.Include
        private Product product;

        private int count;
        private double price;
    }
}
