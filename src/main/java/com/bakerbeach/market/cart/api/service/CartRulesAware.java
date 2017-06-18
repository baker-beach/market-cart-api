package com.bakerbeach.market.cart.api.service;

import java.util.Map;
import java.util.Set;

import com.bakerbeach.market.cart.api.model.CartRuleMessage;

public interface CartRulesAware {

	Set<String> getCouponRules();

	Set<String> getCommonRules();
	
	Map<String, CartRuleMessage> getCartRuleMessages();

}
