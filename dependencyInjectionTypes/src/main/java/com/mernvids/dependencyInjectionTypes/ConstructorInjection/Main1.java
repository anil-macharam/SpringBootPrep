package com.mernvids.dependencyInjectionTypes.ConstructorInjection;

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
    private final Engine engine;  // `final` means this dependency is required

    @Autowired  // 🟣 Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;  // Assigns Engine when Car is created
    }

    public void drive() {
        engine.start();
        System.out.println("🚗 Car is driving...");
    }
}

@SpringBootApplication
public class Main1 implements CommandLineRunner {
    private final Car car;  // `final` because it's required

    @Autowired  // 🟣 Constructor Injection for Car
    public Main1(Car car) {
        this.car = car;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main1.class, args);
    }

    @Override
    public void run(String... args) {
        car.drive();
    }
}
