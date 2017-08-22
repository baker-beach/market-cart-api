package com.bakerbeach.market.cart.api.model;

import java.util.Collection;
import java.util.Set;

public interface CartRuleStore {

	CartRule getInstance(String id);

	CartRule getCodeRuleInstance(String code);

	Collection<CartRule> getCommonRuleInstances();

	Set<String> getCommonRuleIds();

}
