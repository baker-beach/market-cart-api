package com.bakerbeach.market.cart.api.model;

import java.util.Collection;
import java.util.Set;

public interface RuleStore {

	Rule getInstance(String id);

	Rule getRule(String id);

	Collection<Rule> getRules();

	void setRules(Collection<Rule> rules);

	void setRule(Rule rule);

	Set<String> getIds();
	
}
