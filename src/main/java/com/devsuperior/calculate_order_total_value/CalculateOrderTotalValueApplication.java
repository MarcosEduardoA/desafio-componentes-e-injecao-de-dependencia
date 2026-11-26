package com.devsuperior.calculate_order_total_value;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.calculate_order_total_value.entities.Order;
import com.devsuperior.calculate_order_total_value.services.OrderService;

@SpringBootApplication
public class CalculateOrderTotalValueApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(CalculateOrderTotalValueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		
		Order orderExampleOne = new Order(1034, 150.00, 20.0);
		System.out.printf("%nEXAMPLE 1%n");
		System.out.println("Pedido código " + orderExampleOne.getCode());
		System.out.printf("Valor total: R$ %.2f%n%n", orderService.total(orderExampleOne));
		
		Order orderExampleTwo = new Order(2282, 800.00, 10.0);
		System.out.println("EXAMPLE 2");
		System.out.println("Pedido código " + orderExampleTwo.getCode());
		System.out.printf("Valor total: R$ %.2f%n%n", orderService.total(orderExampleTwo));
		
		Order orderExampleThree = new Order(1309, 95.90, 0.0);
		System.out.println("EXAMPLE 3");
		System.out.println("Pedido código " + orderExampleThree.getCode());
		System.out.printf("Valor total: R$ %.2f%n%n", orderService.total(orderExampleThree));
	}
	
	
}
