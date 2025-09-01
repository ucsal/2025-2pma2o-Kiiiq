package br.com.mariojp.solid.ocp.policies;

public class PremiumPolicy implements DiscountPolicy{
    private final double discount=10;

    @Override
    public double apply(double valor) {
        return (100-discount)/100 * valor;
    }
}
