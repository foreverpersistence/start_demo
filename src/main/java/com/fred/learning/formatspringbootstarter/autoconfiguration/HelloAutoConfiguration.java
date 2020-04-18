package com.fred.learning.formatspringbootstarter.autoconfiguration;

import com.fred.learning.formatspringbootstarter.HelloTemplate;
import com.fred.learning.formatspringbootstarter.format.FormatProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description: todo
 * @author: fred
 * @create: 2020-04-18 16:54
 **/
@Import(FormatAutoConfiguration.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public HelloTemplate helloTemplate(FormatProcessor formatProcessor) {
        return new HelloTemplate(formatProcessor);
    }
}
