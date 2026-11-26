package com.devsuperior.calculate_order_total_value.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.calculate_order_total_value.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) 
				+ shippingService.shipment(order);
	}
}
