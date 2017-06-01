package com.bakerbeach.market.cart.api.service;

import java.util.Map;

import com.bakerbeach.market.commons.Messages;
import com.bakerbeach.market.commons.ServiceException;

@SuppressWarnings("serial")
public class CartServiceException extends ServiceException {
	protected Boolean isBlocking = false;
	
	public CartServiceException() {
		super();
	}

	public CartServiceException(Map<String, Object[]> data) {
		super(data);
	}

	public CartServiceException(Messages messages) {
		super(messages);
	}

	public CartServiceException(String key, Object... objects) {
		super(key, objects);
	}

	public CartServiceException(String arg) {
		super(arg);
	}

	public Boolean isBlocking() {
		return isBlocking;
	}

	public void setIsBlocking(Boolean isBlocking) {
		this.isBlocking = isBlocking;
	}

}
