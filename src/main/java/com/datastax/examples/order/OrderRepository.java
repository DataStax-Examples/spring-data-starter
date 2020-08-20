package com.datastax.examples.order;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RestResource(exported = false)
public interface OrderRepository extends CassandraRepository<Order, OrderPrimaryKey> {

  // DELETE

  void deleteByKeyOrderId(UUID orderId);

  void deleteByKeyOrderIdAndKeyProductId(UUID orderId, UUID productId);

  // FIND (all projected)

  ProductNameAndPrice findByKeyOrderIdAndKeyProductId(UUID orderId, UUID productId);

  List<ProductNameAndPrice> findByKeyOrderId(UUID orderId);

  List<ProductNameAndPrice> findAllProjectedBy();
}

