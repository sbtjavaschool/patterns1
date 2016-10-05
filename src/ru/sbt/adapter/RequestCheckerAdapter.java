package ru.sbt.adapter;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class RequestCheckerAdapter implements Validator {
    private final RequestChecker requestValidator;

    public RequestCheckerAdapter(RequestChecker requestValidator) {
        this.requestValidator = requestValidator;
    }

    @Override
    public boolean validate(Request request) {
        return requestValidator.check(request);
    }
}