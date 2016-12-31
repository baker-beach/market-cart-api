package com.bakerbeach.market.cart.api.model;

public class VoucherException extends Exception{

	private static final long serialVersionUID = 1L;
	private String key;
	private Object[] objects;

	public VoucherException() {
		super();
	}
	
	public VoucherException(String key, Object...objects) {
		super();
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
