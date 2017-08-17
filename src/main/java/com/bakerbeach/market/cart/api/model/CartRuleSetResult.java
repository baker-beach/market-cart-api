package com.bakerbeach.market.cart.api.model;

import java.math.BigDecimal;
import java.util.List;

public interface CartRuleSetResult {

	List<RuleResult> getResults();

	BigDecimal getTotal();

	List<RuleMessage> getMessages();

}
