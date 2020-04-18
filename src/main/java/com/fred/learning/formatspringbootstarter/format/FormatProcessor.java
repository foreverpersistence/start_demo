package com.fred.learning.formatspringbootstarter.format;

/**
 * @description: todo
 * @author: fred
 * @create: 2020-04-18 16:33
 **/
public interface FormatProcessor {

    <T> String format(T obj);
}
