package ru.rdude.simpleStore.model.promo.conditions;

import ru.rdude.simpleStore.model.cart.Cart;
import ru.rdude.simpleStore.model.product.Product;

import java.util.function.Predicate;

public interface ConditionMinimalTotalCost1000 extends Predicate<Cart> {
    @Override
    default boolean test(Cart cart) {
        if (cart.getProducts().isEmpty())
            return false;
        return 1000 <= cart.getProducts().stream()
                .map(Cart.ProductEntity::getProduct)
                .map(Product::getPrice)
                .reduce(Double::sum)
                .orElse(cart.getProducts().get(0).getProduct().getPrice());
    }
}
