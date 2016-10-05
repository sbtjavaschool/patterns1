package ru.sbt.template;

import java.util.Map;

public interface AdditionalFieldConverterStrategy {
    Map<String,Object> parseAdditional(String line);
}
