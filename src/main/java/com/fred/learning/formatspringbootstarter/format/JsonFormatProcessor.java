package com.fred.learning.formatspringbootstarter.format;

import com.alibaba.fastjson.JSON;

/**
 * @description: todo
 * @author: fred
 * @create: 2020-04-18 16:36
 **/
public class JsonFormatProcessor implements FormatProcessor {
    @Override
    public <T> String format(T obj) {
        return "JsonFormatProcessor:" + JSON.toJSONString(obj);
    }
}
