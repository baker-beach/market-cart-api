package com.bakerbeach.market.cart.api.model;

import java.util.Date;
import java.util.Set;

import com.bakerbeach.market.core.api.model.Cart;

public interface CartRule {

	enum Intention {
		DISCOUNT_ON_GOODS_AND_SERVICES, DISCOUNT_ON_GOODS, SHIPPING, DISCOUNT_ON_SHIPPING, LINE_DISCOUNT, LINE_CHANGES
	}
	
	enum Status {
		ENABLED,DISABLED,FAILED,PASSED,UNDEFINED
	}

	CartRule getInstance();

	String getId();

	void setId(String id);

	Date getStart();

	void setStart(Date start);

	Date getEnd();

	void setEnd(Date end);

	Intention getIntention();

	void setIntention(Intention intention);

	Status getStatus();
	
	void setStatus(Status status);
	
	CartRuleResult apply(Cart cart, Intention intention, CartRuleContext context);

	Set<String> getCodes();

	Integer getMaxIndividualUse();

	void setMaxIndividualUse(Integer maxIndividualUse);

	Set<String> getEmails();

	void setEmails(Set<String> emails);

	Boolean getNewsletterSubscription();

	void setNewsletterSubscription(Boolean newsletterSubscription);

	String getCustomerId();

	void setCustomerId(String customerId);

	Integer getUseCount();

	void setUseCount(Integer useCount);

	Boolean getIsUsed();

	void setIsUsed(boolean isUsed);

}
