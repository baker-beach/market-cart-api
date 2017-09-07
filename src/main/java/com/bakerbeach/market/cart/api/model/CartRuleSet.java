package com.bakerbeach.market.cart.api.model;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CartRuleSet {

	CartRule get(Object key);

	Set<Entry<String, CartRule>> entrySet();

	Map<String, CartRule> getAll();

//	CartRule add(CartRule rule);

//	void addAll(Collection<CartRule> rules);

	CartRule put(String key, CartRule rule);

	boolean containsKey(Object key);

}
