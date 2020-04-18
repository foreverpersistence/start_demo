package com.fred.learning.formatspringbootstarter;

import com.fred.learning.formatspringbootstarter.autoconfiguration.HelloProperty;
import com.fred.learning.formatspringbootstarter.format.FormatProcessor;

/**
 * @description: todo
 * @author: fred
 * @create: 2020-04-18 16:41
 **/
public class HelloTemplate {

    private FormatProcessor formatProcessor;

    private HelloProperty helloProperty;

    public HelloTemplate(FormatProcessor formatProcessor, HelloProperty helloProperty) {
        this.helloProperty = helloProperty;
        this.formatProcessor = formatProcessor;
    }

    public  <T> String format(T obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("begin format:").append("<br>")
                .append("format result:")
                .append(formatProcessor.format(helloProperty.getInfo()));

        return sb.toString();
    }


}
