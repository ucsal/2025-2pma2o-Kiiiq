package br.com.mariojp.solid.ocp.policies;

public class PartnerPolicy implements DiscountPolicy {
    private final double discount=12;

    @Override
    public double apply(double valor) {
        return (100-discount)/100 * valor;
    }
}
