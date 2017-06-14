package com.bakerbeach.market.cart.api.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface CartRuleResult {

	Map<String, BigDecimal> getDiscounts();

	List<CartRuleError> getErrors();

	boolean hasErrors();

}
