package com.github.rzabilowicz.Patronage2018Task1.Cars;

import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.github.rzabilowicz.Patronage2018Task1.App.Patronage2018Task1Application.cars;


@RestController
@RequestMapping("/cars")
public class CarController{

    //WYSWIETLENIE WSZYSTKICH REKORDÓW Z LISTY "clients"

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ResponseEntity<ArrayList<Car>> getCars() {
        return ResponseEntity.ok(cars.getAll());
    }

    //WYSWIETLENIE REKORDU PO NUMERZE KLIENTA

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Integer> getClient(@PathVariable int idNumber ) {
        int carId = cars.get(idNumber);
        return ResponseEntity.ok(cars.get(idNumber));
    }

    //USUNIECIE REKORDU

    @DeleteMapping(value = "/delete/{idNumber}")
    public ResponseEntity deleteClient(@PathVariable int idNumber) {
        cars.remove(idNumber);
        return ResponseEntity.noContent().build();
    }
}