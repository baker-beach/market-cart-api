package com.bakerbeach.market.cart.api.model;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CartRuleSet {

	RuleInstance get(Object key);

	Set<Entry<String, RuleInstance>> entrySet();

	Map<String, RuleInstance> getAll();

	boolean containsKey(Object key);

	void addCodeRule(String key, RuleInstance rule);

	void addCommonRule(String key, RuleInstance rule);

	void clearCodeRules();

	Map<String, RuleInstance> getCodeRules();

	Date getUpdatedAt();

	void setUpdatedAt(Date updatedAt);

}
