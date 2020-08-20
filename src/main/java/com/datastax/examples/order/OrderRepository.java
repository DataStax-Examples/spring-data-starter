package com.datastax.examples.order;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface OrderRepository extends CassandraRepository<Order, OrderPrimaryKey> {

    @RestResource(exported = false)
    void deleteByKeyOrderId(UUID orderId);

    @RestResource(exported = false)
    void deleteByKeyOrderIdAndKeyProductId(UUID orderId, UUID productId);

    @RestResource(path="name-and-price-only")
    @Query("SELECT product_name, product_price FROM orders WHERE order_id = :orderId")
    List<Order> findProductNamesAndPricesFromOrder(@Param("orderId") UUID orderId);

    @RestResource(exported = false)
    List<Order> findByKeyOrderId(UUID orderId);

    @RestResource(exported = false)
    Order findByKeyOrderIdAndKeyProductId(UUID orderId, UUID productId);

}

