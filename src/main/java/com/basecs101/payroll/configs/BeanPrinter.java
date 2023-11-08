package com.basecs101.payroll.configs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * BeanPrinter for printing spring managed beans
 */
@Configuration
@Slf4j
@Profile("test")
public class BeanPrinter implements InitializingBean {

    @Value(value = "${server.port}")
    int port;
    private final ApplicationContext applicationContext;

    public BeanPrinter(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() {
        log.info("port : {}", port);
        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            log.info("Spring managed Bean Name: " + beanName);
            log.info("----------------------------------");
        }
    }
}

