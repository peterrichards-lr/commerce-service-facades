package com.liferay.liferayobtics.service.proxy;

import com.liferay.commerce.service.CommerceOrderLocalService;
import com.liferay.commerce.util.comparator.CommerceOrderIdComparator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author prich
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = CommerceOrderServiceFacade.class
)
public class CommerceOrderServiceFacadeImpl implements CommerceOrderServiceFacade {

	@Override
	public java.util.List<com.liferay.commerce.model.CommerceOrder> getCommerceOrdersByCommerceAccountId(long commerceAccountId, int start, int end, boolean asc) {
		final CommerceOrderIdComparator orderByComparator = new CommerceOrderIdComparator(asc);
		return commerceOrderLocalService.getCommerceOrdersByCommerceAccountId(commerceAccountId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.commerce.model.CommerceOrder> getCommerceOrdersByCommerceChannelId(long channelId, int start, int end, boolean asc) {
		final CommerceOrderIdComparator orderByComparator = new CommerceOrderIdComparator(asc);
		return commerceOrderLocalService.getCommerceOrders(channelId, start, end, orderByComparator);
	}
	
	@Reference
	private CommerceOrderLocalService commerceOrderLocalService; 

}