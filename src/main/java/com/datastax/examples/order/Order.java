package com.datastax.examples.order;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.*;

import java.io.Serializable;
import java.time.Instant;

@Table(value = "starter_orders")
@Data
public class Order implements Serializable {

    @PrimaryKey
    private OrderPrimaryKey key;

    @Column("product_quantity")
    @CassandraType(type = CassandraType.Name.INT)
    private Integer productQuantity;

    @Column("product_name")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String productName;

    @CassandraType(type = CassandraType.Name.DECIMAL)
    @Column("product_price")
    private Float productPrice;

    @CassandraType(type = CassandraType.Name.TIMESTAMP)
    @Column("added_to_order_at")
    private Instant addedToOrderTimestamp;

}
