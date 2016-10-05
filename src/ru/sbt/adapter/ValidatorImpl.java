package ru.sbt.adapter;

import jdk.nashorn.internal.ir.RuntimeNode;

public class ValidatorImpl implements Validator {
    @Override
    public boolean validate(RuntimeNode.Request request) {
        return request.getArity() > 10;
    }
}
