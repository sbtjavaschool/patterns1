package ru.sbt.adapter;

import jdk.nashorn.internal.ir.RuntimeNode;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class RequestChecker {
    boolean check(Request request) {
        return request != null;
    }
}
