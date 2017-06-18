package com.bakerbeach.market.cart.api.model;

import java.math.BigDecimal;
import java.util.Map;

public interface CartRuleResult {

	Map<String, BigDecimal> getDiscounts();

	CartRuleMessage getMessage();

	void setMessage(CartRuleMessage message);

	boolean hasError();

}
