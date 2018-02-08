package com.bakerbeach.market.cart.api.model;

import java.util.List;

public interface RuleTmpl extends Rule {

	String getClazz();

	void setClazz(String clazz);

	List<String> getShopCode();

	void setShopCode(List<String> shopCode);

}
