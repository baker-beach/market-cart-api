package com.bakerbeach.market.cart.api.model;

import java.util.Map.Entry;
import java.util.Set;

public interface CartRuleContext {
	
	boolean containsKey(Object key);

	Object get(Object key);

	Object put(String key, Object value);

	Set<String> keySet();

	Set<Entry<String, Object>> entrySet();

}
