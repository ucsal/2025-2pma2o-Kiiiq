package br.com.mariojp.solid.ocp.policies;

public class RegularPolicy implements DiscountPolicy {
    private final double discount=5;

    @Override
    public double apply(double valor) {
        return (100-discount)/100 * valor;
    }
}

