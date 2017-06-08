package com.bakerbeach.market.cart.api.service;

import com.bakerbeach.market.cart.api.model.CartRuleContext;
import com.bakerbeach.market.core.api.model.Cart;
import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.ShopContext;

public interface CartRuleService {

	CartRuleContext getNewCartRuleContext(ShopContext shopContext, Customer customer, Cart cart);

}

