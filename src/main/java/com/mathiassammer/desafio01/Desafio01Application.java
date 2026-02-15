package com.mathiassammer.desafio01;

import com.mathiassammer.desafio01.entities.Order;
import com.mathiassammer.desafio01.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	private final OrderService orderService;

	public Desafio01Application(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Alterando para US para ficar com "." no decimal igual descrito no desafio
		Locale.setDefault(Locale.US);

		Order order1 = new Order(1034, 150.00, 20.0);
		System.out.println( "Pedido código " + order1.getCode());
		System.out.printf( "Valor total: R$ %.2f\n", orderService.total(order1));

		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println( "Pedido código " + order2.getCode());
		System.out.printf( "Valor total: R$ %.2f\n", orderService.total(order2));

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println( "Pedido código " + order3.getCode());
		System.out.printf( "Valor total: R$ %.2f\n", orderService.total(order3));
	}
}
