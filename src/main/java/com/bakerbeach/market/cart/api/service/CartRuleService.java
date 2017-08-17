package com.bakerbeach.market.cart.api.service;

import java.util.List;

import com.bakerbeach.market.cart.api.model.CartRuleContext;
import com.bakerbeach.market.cart.api.model.RuleResult;

public interface CartRuleService {

	CartRuleContext getNewCartRuleContext();

	List<RuleResult> lineChangeHandler(CartRuleContext cartRuleContext);

	List<RuleResult> lineDiscountHandler(CartRuleContext cartRuleContext);

	List<RuleResult> cartDiscountHandler(CartRuleContext cartRuleContext);

	List<RuleResult> applyShippingRules(CartRuleContext ruleContext);

}
