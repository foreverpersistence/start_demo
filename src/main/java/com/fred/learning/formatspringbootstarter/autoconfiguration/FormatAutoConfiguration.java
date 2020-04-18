package com.fred.learning.formatspringbootstarter.autoconfiguration;

import com.fred.learning.formatspringbootstarter.format.FormatProcessor;
import com.fred.learning.formatspringbootstarter.format.JsonFormatProcessor;
import com.fred.learning.formatspringbootstarter.format.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @description: todo
 * @author: fred
 * @create: 2020-04-18 16:51
 **/
@Configuration
public class FormatAutoConfiguration {

    /**
     *   StringFormatProcessor f返回值， 会报异常
     * @return
     */
//    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
//    @Bean
//    @Primary// 一个接口定义了多个实现。
//    public StringFormatProcessor stringFormatProcessor() {
//        return new StringFormatProcessor();
//    }
//
//    @ConditionalOnBean(name = "com.alibaba.fastjson.JSON")
//    @Bean
//    public JsonFormatProcessor jsonFormatProcessor(){
//        return new JsonFormatProcessor();
//    }

    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    public FormatProcessor stringFormat() {
        return new StringFormatProcessor();
    }

    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    @Bean
    public FormatProcessor jsonFormat() {
        return new JsonFormatProcessor();
    }


}
