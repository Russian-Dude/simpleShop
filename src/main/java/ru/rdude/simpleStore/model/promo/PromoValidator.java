package ru.rdude.simpleStore.model.promo;

import ru.rdude.simpleStore.model.cart.Cart;

public class PromoValidator {

    public boolean validate(Promo promo, Cart cart) {
        return promo.getConditionsToUse().stream()
                .allMatch(predicate -> predicate.test(cart));
    }

}
