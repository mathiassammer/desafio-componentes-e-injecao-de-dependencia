package com.mathiassammer.desafio01.services;

import com.mathiassammer.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double discountedValue = order.getBasic() - (order.getBasic() * order.getDiscount() / 100.0);
        double freightValue = shippingService.shipment(order);
        return discountedValue + freightValue;
    }
}
