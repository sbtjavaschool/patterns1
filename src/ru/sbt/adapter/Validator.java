package ru.sbt.adapter;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public interface Validator {
    boolean validate(Request request);
}
