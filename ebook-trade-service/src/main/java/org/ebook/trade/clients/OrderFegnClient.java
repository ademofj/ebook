package org.ebook.trade.clients;

import org.ebook.order.model.Order;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "orderservice")
public interface OrderFegnClient {

	@RequestMapping(value = "/v1/order/{orderId}", method = RequestMethod.GET, consumes = "application/json")
	public Order getOrderByOrderId(@PathVariable("orderId") Integer orderId);

	@RequestMapping(value = "/v1/order/{orderId}", method = RequestMethod.PUT, consumes = "application/json")
	public void updateOrderByOrderId(@PathVariable("orderId") Integer orderId, @RequestBody Order trade);

}
