package com.bakerbeach.market.cart.api.model;

import com.bakerbeach.market.cart.api.service.CartRulesAware;
import com.bakerbeach.market.core.api.model.Cart;

public interface CartRuleContext {

	String getShopCode();

	void setShopCode(String shopCode);

	String getCustomerId();

	void setCustomerId(String customerId);

	String getCustomerEmail();

	void setCustomerEmail(String customerEmail);

	Cart getCart();

	void setCart(Cart cart);

	CartRulesAware getCartRuleAware();
	
}
