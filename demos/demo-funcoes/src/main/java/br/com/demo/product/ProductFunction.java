package br.com.demo.product;

import java.util.function.BiFunction;

public class ProductFunction {
    private BiFunction<Double, Double, Double> discountFunction = (price, discount) -> price - (price * discount / 100);

    public double applyDiscount(double price, double discount) {
        return discountFunction.apply(price, discount);
    }
}
