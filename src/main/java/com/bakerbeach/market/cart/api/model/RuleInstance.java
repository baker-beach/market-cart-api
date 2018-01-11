package com.bakerbeach.market.cart.api.model;

import java.util.Map;

import com.bakerbeach.market.commons.Message;
import com.bakerbeach.market.core.api.model.Cart;

public interface RuleInstance extends Rule {

	enum Status {
		ENABLED, DISABLED, FAILED, PASSED
	}

	void init();

	Status getStatus();

	void setStatus(Status status);

	CartRuleResult apply(Cart cart, Intention intention, CartRuleContext context, Map<String, CartRuleResult> results);

	Message getDisabledMessage();

	Message getFailedMessage();

	Message getPassedMessage();

	String getCustomerId();

	void setCustomerId(String customerId);

	Integer getUseCount();

	void setUseCount(Integer useCount);

	Boolean getIsUsed();

	void setIsUsed(boolean isUsed);

}
