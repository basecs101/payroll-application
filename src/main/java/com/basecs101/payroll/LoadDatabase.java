package com.basecs101.payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    @Qualifier(value = "cmdLineRunner")
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Komal", "HR")));
            log.info("Preloading " + repository.save(new Employee("Bhagyashree", "Admin")));
        };
    }
}