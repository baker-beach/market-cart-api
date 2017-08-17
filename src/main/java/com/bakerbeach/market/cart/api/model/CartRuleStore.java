package com.bakerbeach.market.cart.api.model;

import java.util.Collection;
import java.util.Set;

public interface CartRuleStore {

	CartRule getInstance(String id);

	CartRule getCodeRuleInstance(String code);

	Collection<CartRule> getCommonRuleInstances();

	Set<String> getCommonRuleIds();

//	CartRuleSetResult apply(CartRuleSet ruleSet, Intention intention, CartRuleContext context);

//	Integer getUseCount(String code, String customerId);

//	Integer setUse(String code, String customerId, Integer inc, Integer max, String orderId, Date date);

//	void unsetUse(String code, String customerId, Integer dec, String orderId, Date date);

//	CartRuleSetResult confirmUse(Cart cart, Customer customer, Integer inc, String comment, Date date);

}
