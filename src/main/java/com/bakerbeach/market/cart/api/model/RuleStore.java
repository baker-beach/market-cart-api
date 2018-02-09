package com.bakerbeach.market.cart.api.model;

import java.util.Collection;

public interface RuleStore {

	RuleInstance instanceById(String shopCode, String id);

	@Deprecated
	RuleInstance instanceById(String id);

	RuleInstance instanceByCode(String shopCode, String code);

	@Deprecated
	RuleInstance instanceByCode(String code);

	Collection<RuleInstance> commonInstances(String shopCode);

	@Deprecated
	Collection<RuleInstance> commonInstances();

}
