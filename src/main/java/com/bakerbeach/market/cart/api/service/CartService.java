package com.bakerbeach.market.cart.api.service;

import java.math.BigDecimal;
import java.util.List;

import com.bakerbeach.market.core.api.model.Cart;
import com.bakerbeach.market.core.api.model.CartItem;
import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.Messages;
import com.bakerbeach.market.core.api.model.ShopContext;

public interface CartService {

	Messages addCartItem(ShopContext shopContext, Cart cart, CartItem newCartItem) throws CartServiceException;

	Messages setQuantity(Cart cart, String id, BigDecimal quantity) throws CartServiceException;

	void removeCartItem(Cart cart, CartItem cartItem);

	void clear(Cart cart);

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

}
