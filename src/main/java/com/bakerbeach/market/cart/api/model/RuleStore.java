package com.bakerbeach.market.cart.api.model;

import java.util.Collection;

public interface RuleStore {

	RuleInstance instanceById(String id);

	RuleInstance instanceByCode(String code);

	Collection<RuleInstance> commonInstances();

}
