package com.mernvids.dependencyInjectionTypes.SetterInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
class Engine {
    public void start() {
        System.out.println("🚗 Engine started!");
    }
}

@Component
class Car {
    private Engine engine;  // No direct @Autowired here

    @Autowired
    public void setEngine(Engine engine) {  // 🟡 Setter Injection
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("🚗 Car is driving...");
    }
}

@SpringBootApplication
public class Main implements CommandLineRunner {
    private Car car;

    @Autowired
    public void setCar(Car car) {  // 🟡 Setter Injection for Car
        this.car = car;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        car.drive();
    }
}
