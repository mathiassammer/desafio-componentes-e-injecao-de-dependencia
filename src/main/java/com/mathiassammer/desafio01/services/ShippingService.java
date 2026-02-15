package com.mathiassammer.desafio01.services;

import com.mathiassammer.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() > 200.0) {
            return 0.0;
        } else {
            return 12.0;
        }
    }
}
