package com.arjunit.springbootkafkaconsumer.service;


import com.arjunit.springbootkafkaconsumer.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "employee_topic", groupId = "employee_group")
    public void consumeEmployee(Employee employee) {
        log.info("==========================================");
        log.info("Consumer received employee from Kafka: {}", employee);
        log.info("Employee ID: {}", employee.getId());
        log.info("Employee Name: {}", employee.getName());
        log.info("Employee Post: {}", employee.getPost());
        log.info("Employee Salary: {}", employee.getSalary());
        log.info("==========================================");
    }
}