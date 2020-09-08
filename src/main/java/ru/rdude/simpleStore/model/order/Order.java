package ru.rdude.simpleStore.model.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rdude.simpleStore.model.product.Product;
import ru.rdude.simpleStore.model.promo.Promo;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private UUID id;
    private OrderStatus status;
    private double totalPrice;
    private List<Promo> promos;
    private List<Product> products;


}
