package com.bakerbeach.market.cart.api.service;

import java.util.List;
import java.util.Set;

import com.bakerbeach.market.cart.api.model.RuleMessage;

public interface RuleAware {

	List<RuleMessage> getRuleMessages();

	Set<String> getCouponRules();

	Set<String> getCommonRules();

}
