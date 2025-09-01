package br.com.mariojp.solid.ocp;

import java.util.HashMap;

public class DiscountCalculator {
    PoliciesMap policiesMap = new PoliciesMap();

    public double apply(double amount, CustomerType customerType) {
        return  policiesMap.discount.get(customerType).apply(amount);
    }
}
