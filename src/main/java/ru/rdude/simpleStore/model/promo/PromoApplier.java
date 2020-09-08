package ru.rdude.simpleStore.model.promo;

import ru.rdude.simpleStore.model.cart.Cart;
import ru.rdude.simpleStore.model.product.Product;

public class PromoApplier {

    public void apply(Cart cart, Promo promo) {
        cart.getProducts().stream()
                .filter(productEntity -> promo.getProductTypesInPromo()
                        .stream()
                        .anyMatch(aClass -> aClass.isAssignableFrom(productEntity.getClass())))
                .forEach(promo.getAction()::action);
    }
}
