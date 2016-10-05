package ru.sbt.template;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StupidFieldsConverter extends BaseTradeConverter {
    @Override
    protected Map<String, Object> parseAdditional(String line) {
        return Collections.emptyMap();
    }
}
