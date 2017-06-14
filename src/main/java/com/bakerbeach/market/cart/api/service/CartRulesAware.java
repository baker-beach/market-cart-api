package com.bakerbeach.market.cart.api.service;

import java.util.Set;

public interface CartRulesAware {

	Set<String> getCouponRules();

	Set<String> getCommonRules();

}
