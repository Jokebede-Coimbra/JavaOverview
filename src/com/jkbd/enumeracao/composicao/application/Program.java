package com.jkbd.enumeracao.composicao.application;

import java.util.Date;

import com.jkbd.enumeracao.composicao.entities.Order;
import com.jkbd.enumeracao.composicao.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {


		Order order = new Order(101, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		// Conversão de String para enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		

	}

}
