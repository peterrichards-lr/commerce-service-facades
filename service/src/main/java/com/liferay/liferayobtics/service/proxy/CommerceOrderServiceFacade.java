package com.liferay.liferayobtics.service.proxy;

public interface CommerceOrderServiceFacade {

	public java.util.List<com.liferay.commerce.model.CommerceOrder> getCommerceOrdersByCommerceAccountId(long commerceAccountId, int start, int end, boolean asc);

	public java.util.List<com.liferay.commerce.model.CommerceOrder> getCommerceOrdersByCommerceChannelId(long channelId, int start, int end, boolean asc);
}
