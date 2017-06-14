package com.bakerbeach.market.cart.api.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public interface CartRule {

	CartRule getInstance();

	CartRuleResult apply(CartRuleContext context);

	String getCode();

	BigDecimal getRate();

	BigDecimal getShippingDiscountRate();

	Integer getMaxIndividualUse();

	Set<String> getEmails();

	Boolean getNewsletterSubscription();

	Date getStart();

	Date getEnd();

}
