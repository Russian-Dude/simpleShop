package ru.rdude.simpleStore.model.promo;

import ru.rdude.simpleStore.model.cart.Cart;

import java.util.function.Function;

@FunctionalInterface
public interface PromoAction {
    void action(Cart.ProductEntity productEntity);
}
