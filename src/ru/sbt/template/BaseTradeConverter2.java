package ru.sbt.template;

import static java.lang.Double.parseDouble;

public class BaseTradeConverter2 {
    private final AdditionalFieldConverterStrategy strategy;

    public BaseTradeConverter2(AdditionalFieldConverterStrategy strategy) {
        this.strategy = strategy;
    }

    public Trade convert(String line) {
        Trade trade = new Trade();
        trade.setPrice(parsePrice(line));
        trade.setName(parseName(line));
        trade.setCount(parseCount(line));
        trade.setAdditional(strategy.parseAdditional(line));
        return trade;
    }

    //    line = "1000      ;name       ;         count:12;";
    private int parseCount(String line) {
        int count = line.indexOf("count");
        int end = line.indexOf(";", count);
        return Integer.parseInt(line.substring(count + 6, end));
    }

    private String parseName(String line) {
        return line.substring(10, 20);
    }

    private double parsePrice(String line) {
        return parseDouble(line.substring(0, 10));
    }
}
