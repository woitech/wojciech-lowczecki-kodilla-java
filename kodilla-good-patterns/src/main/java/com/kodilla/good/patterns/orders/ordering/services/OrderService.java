package com.kodilla.good.patterns.orders.ordering.services;

import com.kodilla.good.patterns.orders.ordering.*;

public interface OrderService {
    // returns null if order fails
    public PlacedProductOrder order(ProductOrder order);
}
