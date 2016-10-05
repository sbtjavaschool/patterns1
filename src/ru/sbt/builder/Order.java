package ru.sbt.builder;

public class Order {
    private final Direction direction;
    private final double price;
    private final double quantity;
    private final String instrument;

    public Order(Direction direction, double price, double quantity, String instrument) {
        this.direction = direction;
        this.price = price;
        this.quantity = quantity;
        this.instrument = instrument;
    }

    public Direction getDirection() {
        return direction;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getInstrument() {
        return instrument;
    }
}
