package ru.rdude.simpleStore.model.promo;

import lombok.Data;
import ru.rdude.simpleStore.model.cart.Cart;
import ru.rdude.simpleStore.model.product.Product;

import java.util.Set;
import java.util.function.Predicate;

@Data
public class Promo {

    private Set<Class<? extends Product>> productTypesInPromo;
    private Set<Predicate<Cart>> conditionsToUse;
    private PromoAction action;
}
