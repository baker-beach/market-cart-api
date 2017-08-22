package com.bakerbeach.market.cart.api.service;

import com.bakerbeach.market.cart.api.model.CartRuleSet;
import com.bakerbeach.market.commons.Messages;

public interface CartRuleAware {

	CartRuleSet getCartRuleSet();
	
	Messages getMessages();

}
