package com.fred.learning.formatspringbootstarter.autoconfiguration;

import com.fred.learning.formatspringbootstarter.HelloTemplate;
import com.fred.learning.formatspringbootstarter.format.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description: todo
 * @author: fred
 * @create: 2020-04-18 16:54
 **/
@EnableConfigurationProperties(HelloProperty.class)
@Import(FormatAutoConfiguration.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public HelloTemplate helloTemplate(HelloProperty helloProperty,FormatProcessor formatProcessor) {
        return new HelloTemplate(formatProcessor,helloProperty);
    }
}
