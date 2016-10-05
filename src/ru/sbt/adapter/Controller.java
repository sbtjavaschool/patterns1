package ru.sbt.adapter;

import jdk.nashorn.internal.ir.RuntimeNode;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class Controller {
    private final Validator validator;

    public Controller(Validator validator) {
        this.validator = validator;
    }

    public void response(Request request) {
        if (!validator.validate(request)) {
            throw new RuntimeException();
        }
    }
}
