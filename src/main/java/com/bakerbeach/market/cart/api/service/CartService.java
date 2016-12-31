package com.bakerbeach.market.cart.api.service;

import java.math.BigDecimal;
import java.util.List;

import com.bakerbeach.market.core.api.model.Cart;
import com.bakerbeach.market.core.api.model.CartItem;
import com.bakerbeach.market.core.api.model.CartItem.CartItemComponent;
import com.bakerbeach.market.core.api.model.CartItem.CartItemOption;
import com.bakerbeach.market.core.api.model.Coupon;
import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.Messages;
import com.bakerbeach.market.core.api.model.ShopContext;

public interface CartService {

	Cart getInstance(Customer customer);

	Cart getNewInstance(Customer customer);

	Messages addCartItem(ShopContext shopContext, Cart cart, CartItem newCartItem) throws CartServiceException;

	Messages setQuantity(Cart cart, String id, BigDecimal quantity) throws CartServiceException;

	void removeCartItem(Cart cart, CartItem cartItem);

	void clear(Cart cart);

	void calculate(ShopContext shopContext, Cart cart, Customer customer);

	Messages check(ShopContext shopContext, Cart cart, Customer customer, boolean timing);

	void setCurrency(ShopContext shopContext, Cart cart, Customer customer);

	Coupon getCoupon(String couponCode);

	Integer getIndividualUseCount(String code, String customerId);

	void setIndividualUse(Coupon coupon, String customerId, String orderId, Cart cart, String shopCode)
			throws CartServiceException;

	@Deprecated
	void saveCart(Cart cart) throws CartServiceException;

	void saveCart(Customer customer, Cart cart) throws CartServiceException;

	Cart loadCart(String id) throws CartServiceException;

	Cart loadActiveCart(Customer customer) throws CartServiceException;

	List<Cart> loadCart(Customer customer) throws CartServiceException;

	List<Cart> loadCart(Customer customer, List<String> status) throws CartServiceException;

	void deleteCart(Cart cart) throws CartServiceException;

	void merge(Cart storedCart, Cart cart);

	Cart getNewCart();

	CartItem getNewCartItem(String gtin, BigDecimal itemCount);

	CartItemComponent getNewCartItemComponent(String componentName);

	CartItemOption getNewCartItemOption(String optionCode);

}
