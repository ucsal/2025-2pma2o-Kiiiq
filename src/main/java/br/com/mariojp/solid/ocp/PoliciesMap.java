package br.com.mariojp.solid.ocp;

import br.com.mariojp.solid.ocp.policies.DiscountPolicy;
import br.com.mariojp.solid.ocp.policies.PartnerPolicy;
import br.com.mariojp.solid.ocp.policies.PremiumPolicy;
import br.com.mariojp.solid.ocp.policies.RegularPolicy;

import java.util.HashMap;

public class PoliciesMap {
    HashMap<CustomerType, DiscountPolicy> discount;
    public PoliciesMap() {
        discount = new HashMap<>();
        discount.put(CustomerType.REGULAR, new RegularPolicy());
        discount.put(CustomerType.PREMIUM, new PremiumPolicy());
        discount.put(CustomerType.PARTNER, new PartnerPolicy());
    }
}
