package ru.sbt.adapter;

import ru.sbt.composite.CompositeValidator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RequestCheckerAdapter adapter = new RequestCheckerAdapter(new RequestChecker());
        Controller controller = new Controller(adapter);


        Controller c = new Controller(new CompositeValidator(adapter, new ValidatorImpl()));
    }
}