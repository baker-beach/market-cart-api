package com.bakerbeach.market.cart.api.service;

import java.util.List;

import com.bakerbeach.market.cart.api.model.RuleContext;
import com.bakerbeach.market.cart.api.model.RuleResult;

public interface CartRuleService {

	RuleContext getNewCartRuleContext();

	List<RuleResult> lineChangeHandler(RuleContext cartRuleContext);

	List<RuleResult> lineDiscountHandler(RuleContext cartRuleContext);

	List<RuleResult> cartDiscountHandler(RuleContext cartRuleContext);

	List<RuleResult> applyShippingRules(RuleContext ruleContext);

}
