package com.bakerbeach.market.cart.api.model;

import com.bakerbeach.market.cart.api.service.RuleAware;
import com.bakerbeach.market.core.api.model.Address;
import com.bakerbeach.market.core.api.model.Cart;

public interface RuleContext {

	String getShopCode();

	void setShopCode(String shopCode);

	String getCustomerId();

	void setCustomerId(String customerId);

	String getCustomerEmail();

	void setCustomerEmail(String customerEmail);

	Cart getCart();

	void setCart(Cart cart);

	void setShippingAddress(Address shippingAddress);

	Address getShippingAddress();

	RuleAware getCartRuleAware();

}
