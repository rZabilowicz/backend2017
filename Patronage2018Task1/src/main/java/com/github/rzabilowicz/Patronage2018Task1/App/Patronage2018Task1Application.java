package com.github.rzabilowicz.Patronage2018Task1.App;

import com.github.rzabilowicz.Patronage2018Task1.Cars.Car;
import com.github.rzabilowicz.Patronage2018Task1.Client.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  static com.github.rzabilowicz.Patronage2018Task1.App.ExampleData.example;

@SpringBootApplication
public class Patronage2018Task1Application {

    public static void main(String[] args) {
        makeDatabase();
        example();
        SpringApplication.run(Patronage2018Task1Application.class, args);

    }

    public static Database<Car> cars;
    public static Database<Client> clients;


    public static void makeDatabase() {
        cars = new Database<>();
        clients = new Database<>();
    }
}
