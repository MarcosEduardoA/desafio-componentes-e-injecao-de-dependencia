package com.devsuperior.calculate_order_total_value.services;

import org.springframework.stereotype.Service;

import com.devsuperior.calculate_order_total_value.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		
		if (order.getBasic() < 100.00) {
			return 20.00;
		}
		else if (order.getBasic() < 200.00) {
			return 12.00;
		}
		
		return 0.0;
	}

}
