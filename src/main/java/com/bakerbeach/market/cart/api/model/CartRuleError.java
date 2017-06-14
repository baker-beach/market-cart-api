package com.bakerbeach.market.cart.api.model;

public class CartRuleError {
	private String key;
	private Object[] objects;

	public CartRuleError() {
	}

	public CartRuleError(String key, Object... objects) {
		this.key = key;
		this.objects = objects;
	}

	public String getKey() {
		return key;
	}

	public Object[] getObjects() {
		return objects;
	}

}
