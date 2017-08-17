package com.bakerbeach.market.cart.api.model;

import java.util.Date;

public interface Rule {

	Rule getInstance();

	RuleResult apply(RuleContext context);

	String getId();

	void setId(String id);

	Date getStart();

	void setStart(Date start);

	Date getEnd();

	void setEnd(Date end);

}