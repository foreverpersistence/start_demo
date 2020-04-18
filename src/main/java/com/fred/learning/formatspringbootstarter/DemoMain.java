package com.fred.learning.formatspringbootstarter;

import com.fred.learning.formatspringbootstarter.autoconfiguration.HelloAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: todo
 * @author: fred
 * @create: 2020-04-18 21:13
 **/
public class DemoMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloAutoConfiguration.class);

        context.getBean(HelloTemplate.class);
    }
}
