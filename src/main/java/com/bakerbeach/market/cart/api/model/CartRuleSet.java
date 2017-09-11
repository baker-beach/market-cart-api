package com.bakerbeach.market.cart.api.model;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CartRuleSet {

	CartRule get(Object key);

	Set<Entry<String, CartRule>> entrySet();

	Map<String, CartRule> getAll();

	boolean containsKey(Object key);

	void addCodeRule(String key, CartRule rule);

	void addCommonRule(String key, CartRule rule);

	void clearCodeRules();

	Map<String, CartRule> getCodeRules();

}
