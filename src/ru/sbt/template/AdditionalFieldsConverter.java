package ru.sbt.template;

import java.util.HashMap;
import java.util.Map;

public abstract class AdditionalFieldsConverter extends BaseTradeConverter {
    @Override
    protected Map<String, Object> parseAdditional(String line) {
        String substring = getSubstring(line);
        String[] split = substring.split("_");
        Map<String, Object> map = new HashMap<>();
        for (String s : split) {
            map.put(s, s.length());
        }
        return map;
    }

    protected abstract String getSubstring(String line);
}
