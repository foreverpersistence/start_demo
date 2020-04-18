package com.fred.learning.formatspringbootstarter.format;

import java.util.Objects;

/**
 * @description: todo
 * @author: fred
 * @create: 2020-04-18 16:34
 **/
public class StringFormatProcessor implements FormatProcessor {
    @Override
    public <T> String format(T obj) {
        return "StringFormatProcessor " + Objects.toString(obj);
    }
}
