package com.poazy.dubbo.rest.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableDiscoveryClient
@EnableAspectJAutoProxy
@SpringBootApplication
@EnableDubbo
@Slf4j
public class DubboRestDemoApplication {

    public static void main(String[] args) {
        try {
            SpringApplicationBuilder springApplicationBuilder =
                    new SpringApplicationBuilder(DubboRestDemoApplication.class)
                            .web(WebApplicationType.SERVLET);
            ApplicationContext applicationContext = springApplicationBuilder.run(args);
        } catch (Throwable t) {
            t.printStackTrace();
            throw new RuntimeException(t);
        }
    }

}
