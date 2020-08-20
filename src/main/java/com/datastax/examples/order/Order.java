package com.datastax.examples.order;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.*;

import java.io.Serializable;
import java.time.Instant;

@Table(value = "orders")
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

    public Order(OrderPrimaryKey key, String productName, Integer productQuantity, Float productPrice, Instant addedToOrderTimestamp){
        this.key = key;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.addedToOrderTimestamp = addedToOrderTimestamp;
    }

    public OrderPrimaryKey getKey() {
        return key;
    }

    public void setKey(OrderPrimaryKey key) {
        this.key = key;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public Instant getAddedToOrderTimestamp() {
        return addedToOrderTimestamp;
    }

    public void setAddedToOrderTimestamp(Instant addedToOrderTimestamp) {
        this.addedToOrderTimestamp = addedToOrderTimestamp;
    }
}
