package ru.sbt.builder;

import java.nio.ByteBuffer;

import static ru.sbt.builder.Direction.BUY;
import static ru.sbt.builder.Direction.SELL;

public class OrderBuilder {
    private final Direction direction;
    private double price;
    private double quantity;
    private String instrument;

    public OrderBuilder(Direction direction) {
        this.direction = direction;
    }


    public static OrderBuilder buy() {
        return new OrderBuilder(BUY);
    }

    public static OrderBuilder sell() {
        return new OrderBuilder(SELL);
    }

    public OrderBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public OrderBuilder withQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderBuilder withInstrument(String instrument) {
        this.instrument = instrument;
        return this;
    }

    public Order build() {
        if (price == 0 || quantity == 0 || instrument == null) {
            throw new IllegalArgumentException("Missing field");
        }

        return new Order(direction, price, quantity, instrument);
    }

    public OrderBuilder usdRub() {
        instrument = "USDRUB";
        quantity = 100;
        return null;
    }
}
