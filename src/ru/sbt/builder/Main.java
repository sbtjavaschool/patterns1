package ru.sbt.builder;

import java.util.stream.Stream;

import static ru.sbt.builder.OrderBuilder.buy;

public class Main {
    public static void main(String[] args) {
//        Order usdrub = new Order(Direction.BUY, 10, 12, "USDRUB");

        Order o1 = buy().usdRub().build();


        /*Order order = buy()
                .withPrice(56)
                .withQuantity(12)
                .withInstrument("USDRUB")
                .build();*/
    }
}
