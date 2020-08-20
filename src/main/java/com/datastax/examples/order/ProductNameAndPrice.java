package com.datastax.examples.order;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "product-name-and-price", types = { Order.class })
public interface ProductNameAndPrice {
    String getProductName();
    Float getProductPrice();
}
