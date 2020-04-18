package com.fred.learning.formatspringbootstarter.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @description: 添加 properties，  需要引入
 *  <dependency>
 *             <groupId>org.springframework.boot</groupId>
 *             <artifactId>spring-boot-configuration-processor</artifactId>
 *             <version>2.2.6.RELEASE</version>
 *             <optional>true</optional>
 *         </dependency>
 * @author: fred
 * @create: 2020-04-18 21:44
 **/
@ConfigurationProperties(prefix="hello.fred" )
public class HelloProperty {

    public Map<String, Object> info;

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
