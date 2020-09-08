package ru.rdude.simpleStore.model.promo.ActionsImpl;

import ru.rdude.simpleStore.model.cart.Cart;
import ru.rdude.simpleStore.model.promo.PromoAction;

public interface Promo30PercentsOffAll extends PromoAction {

    @Override
    default void action(Cart.ProductEntity productEntity) {
        productEntity.setPrice(productEntity.getPrice() * 0.7);
    }
}
