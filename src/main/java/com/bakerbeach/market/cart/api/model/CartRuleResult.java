package com.bakerbeach.market.cart.api.model;

import java.math.BigDecimal;
import java.util.Map;

import com.bakerbeach.market.commons.Messages;

public interface CartRuleResult {

	Map<String, BigDecimal> getValues();

	Messages getMessages();

	Object put(String key, Object value);

	Object get(Object key);

	boolean containsKey(Object key);

	String getId();
	
	String getCode();

	void setCode(String code);

}
