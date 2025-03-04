package com.mernvids.dependencyInjectionTypes.FieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component  // Marks this as a Spring-managed bean
class Engine {
    public void start() {
        System.out.println("🚗 Engine started!");
    }
}

// 🚙 Car class depends on Engine
@Component
class Car {
    @Autowired  // 🔴 Field Injection (Spring injects Engine here)
    private Engine engine;

    public void drive() {
        engine.start();  // Calls Engine's start() method
        System.out.println("🚗 Car is driving...");
    }
}

// 🏁 Main Class to Start the Application
@SpringBootApplication
public class Main implements CommandLineRunner {  // Ensures code runs on startup
    @Autowired
    private Car car;  // 🔴 Field Injection (Spring injects Car)

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);  // Spring Boot starts
    }

    @Override
    public void run(String... args) {
        car.drive();  // ✅ Calls Car's drive method
    }
}