package com.bakerbeach.market.cart.api.service;

import java.util.List;

import com.bakerbeach.market.cart.api.model.CartRuleContext;
import com.bakerbeach.market.cart.api.model.CartRuleResult;

public interface CartRuleService {

	CartRuleContext getNewCartRuleContext();

	List<CartRuleResult> lineChangeHandler(CartRuleContext cartRuleContext);

	List<CartRuleResult> lineDiscountHandler(CartRuleContext cartRuleContext);

	List<CartRuleResult> cartDiscountHandler(CartRuleContext cartRuleContext);

}
