package com.bakerbeach.market.cart.api.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Rule {

	enum Type {
		COMMON, CODE
	}

	enum Intention {
		DISCOUNT_ON_GOODS_AND_SERVICES, DISCOUNT_ON_GOODS, SHIPPING, DISCOUNT_ON_SHIPPING, LINE_DISCOUNT, LINE_CHANGES
	}

	enum Status {
		ENABLED, DISABLED, FAILED, PASSED
	}

	String getId();

	void setId(String id);

	Type getType();

	void setType(Type type);

	List<Intention> getIntentions();

	void setIntentions(List<Intention> intentions);

	Date getStart();

	void setStart(Date start);

	Date getEnd();

	void setEnd(Date end);

	Integer getMaxIndividualUse();

	void setMaxIndividualUse(Integer maxIndividualUse);

	Map<String, Object> getData();

	void setData(Map<String, Object> data);

	Set<String> getEmails();

	void setEmails(Set<String> emails);

	Boolean getNewsletterSubscription();

	void setNewsletterSubscription(Boolean newsletterSubscription);

}
