package com.bakerbeach.market.cart.api.model;

import java.math.BigDecimal;
import java.util.Map;

public interface RuleResult {

	Map<String, BigDecimal> getValues();

	RuleMessage getMessage();

	void setMessage(RuleMessage message);

	boolean hasError();

	Object put(String key, Object value);

	Object get(Object key);

	boolean containsKey(Object key);

}
