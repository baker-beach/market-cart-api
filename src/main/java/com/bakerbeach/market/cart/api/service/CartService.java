package com.bakerbeach.market.cart.api.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bakerbeach.market.cart.api.model.CartRule;
import com.bakerbeach.market.commons.Message;
import com.bakerbeach.market.commons.Messages;
import com.bakerbeach.market.core.api.model.Cart;
import com.bakerbeach.market.core.api.model.CartItem;
import com.bakerbeach.market.core.api.model.Coupon;
import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.ShopContext;

public interface CartService {

	Messages addCartItem(ShopContext shopContext, Cart cart, CartItem newCartItem) throws CartServiceException;

	Messages setQuantity(Cart cart, String id, BigDecimal quantity) throws CartServiceException;

	void removeCartItem(Cart cart, CartItem cartItem);

	void clear(Cart cart);

	void calculate(ShopContext shopContext, Cart cart, Customer customer, Messages messages);

	void calculate(ShopContext shopContext, Cart cart, Customer customer);

	Messages check(ShopContext shopContext, Cart cart, Customer customer, boolean timing);

	void setCurrency(ShopContext shopContext, Cart cart, Customer customer);

	void saveCart(Customer customer, Cart cart) throws CartServiceException;

	Cart loadCart(ShopContext context, String id) throws CartServiceException;

	List<Cart> loadCart(ShopContext context, Customer customer, List<String> codes, List<String> status)
			throws CartServiceException;

	Cart loadActiveCart(ShopContext context, Customer customer) throws CartServiceException;

	void deleteCart(Cart cart) throws CartServiceException;

	void merge(Cart storedCart, Cart cart);

	Cart getInstance(ShopContext shopContext, Customer customer) throws CartServiceException;

	Cart getNewInstance(ShopContext shopContext, Customer customer) throws CartServiceException;

	Cart getNewCart(ShopContext shopContex) throws CartServiceException;

	void setIndividualUse(Coupon coupon, String customerId, String orderId, Cart cart, String shopCode)
			throws CartServiceException;

	void setRuleUse(ShopContext context, Cart cart, Customer customer, String string) throws CartServiceException;

	void unsetRuleUse(ShopContext context, Cart cart, Customer customer, String string);

	void setStatus(Customer customer, Cart cart, String status) throws CartServiceException;

	Messages checkCartRules(Cart cart, Customer customer, Date date);

	Message checkCartRule(String key, CartRule rule, Date date, Customer customer);

	void addCodeRule(Cart cart, String key, CartRule rule);

	CartRule getCodeRuleInstance(String couponCode);

	void clearCodeRules(Cart cart);

	Map<String, CartRule> getCodeRules(Cart cart);

}
