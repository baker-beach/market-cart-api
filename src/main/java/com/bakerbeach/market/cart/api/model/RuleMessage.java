package com.bakerbeach.market.cart.api.model;

public class RuleMessage {
	public enum Type {
		ERROR, WARNUNG, INFO
	}

	private Type type = Type.INFO;
	private String key;
	private Object[] objects;

	public RuleMessage() {
	}

	public RuleMessage(Type type, String key, Object... objects) {
		this.type = type;
		this.key = key;
		this.objects = objects;
	}

	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}

	public Object[] getObjects() {
		return objects;
	}

	public void setObjects(Object[] objects) {
		this.objects = objects;
	}
	
}
