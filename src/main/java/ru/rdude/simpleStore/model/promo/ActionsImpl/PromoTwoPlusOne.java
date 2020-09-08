package ru.rdude.simpleStore.model.promo.ActionsImpl;

import ru.rdude.simpleStore.model.cart.Cart;
import ru.rdude.simpleStore.model.promo.PromoAction;

public interface PromoTwoPlusOne extends PromoAction {
    @Override
    default void action(Cart.ProductEntity productEntity) {
        productEntity.setPrice(productEntity.getPrice() / productEntity.getCount());
    }
}
