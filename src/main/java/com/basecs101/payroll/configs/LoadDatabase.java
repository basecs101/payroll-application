package com.basecs101.payroll.configs;

import com.basecs101.payroll.model.Employee;
import com.basecs101.payroll.model.Order;
import com.basecs101.payroll.model.Status;
import com.basecs101.payroll.repository.EmployeeRepository;
import com.basecs101.payroll.repository.OrderRepository;
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
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

        return args -> {
            log.info("Preloading " + employeeRepository.save(new Employee("Komal","Bankar",  "HR")));
            log.info("Preloading " + employeeRepository.save(new Employee("Bhagyashree","Survavanshi", "Admin")));


            log.info("Preloading "+ orderRepository.save(
                    new Order("Dove shampoo", Status.IN_PROGRESS)));

            log.info("Preloading "+ orderRepository.save(
                    new Order("Perfume", Status.IN_PROGRESS)
            ));
        };
    }
}