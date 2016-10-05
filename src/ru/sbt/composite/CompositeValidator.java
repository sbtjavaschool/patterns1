package ru.sbt.composite;

import jdk.nashorn.internal.ir.RuntimeNode;
import ru.sbt.adapter.Validator;

import java.util.Arrays;
import java.util.List;

public class CompositeValidator implements Validator {
    private final List<Validator> validators;

    public CompositeValidator(Validator... validators) {
        this.validators = Arrays.asList(validators);
    }

    @Override
    public boolean validate(RuntimeNode.Request request) {
        for (Validator validator : validators) {
            if (!validator.validate(request)) return false;
        }
        return true;
    }
}
