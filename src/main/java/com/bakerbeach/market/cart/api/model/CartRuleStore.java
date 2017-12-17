package com.bakerbeach.market.cart.api.model;

import java.util.Collection;
import java.util.Set;

public interface CartRuleStore {

	RuleInstance getInstance(String id);

	@Deprecated
	RuleInstance getCodeRuleInstance(String code);

	Collection<RuleInstance> getCommonRuleInstances();

	Set<String> getCommonRuleIds();

}
