package com.fred.learning.formatspringbootstarter;

import com.fred.learning.formatspringbootstarter.format.FormatProcessor;

/**
 * @description: todo
 * @author: fred
 * @create: 2020-04-18 16:41
 **/
public class HelloTemplate {

    private FormatProcessor formatProcessor;

    public HelloTemplate(FormatProcessor formatProcessor) {
        this.formatProcessor = formatProcessor;
    }

    public  <T> String format(T obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello template:").append("\n")
                .append("format result:").append("\n")
                .append(formatProcessor.format(obj));
        return sb.toString();
    }


}
