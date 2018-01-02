package com.github.rzabilowicz.Patronage2018Task1.App;

import com.github.rzabilowicz.Patronage2018Task1.Client.Client;
import com.github.rzabilowicz.Patronage2018Task1.Cars.Car;
import java.util.Date;

public class ExampleData {

    public static void example(){

        /////KLIENT//////

        Client.newClient make = new Client.newClient();

        make.setIdNumber(1);
        make.setNames("Maria Anna");
        make.setSurname("Nowak");
        make.setParentsNames("Jan Janina");
        make.setBirthdayDate(new Date());
        make.setBithdayCountry("Polska");
        make.setPesel(78020202365F);
        make.setCity("Szczecin");
        make.setStreet("Wiosenne");
        make.setHomeNumber("21A/6");
        make.setPostCode("78-245");
        make.setWhoIssued("Prezydent Miasta Szczecin");
        make.setReleaseDate(new Date());
        make.setExpirationDate(new Date());

        /////SAMOCHÓD///////

        Car.CarRegister make2 = new Car.CarRegister();

        make2.setOwnerId(1);
        make2.setAutoId("ZS35645");
        make2.setBrand("Toyota");
        make2.setFirstRegisterDate(new Date());
        make2.setExpirationDate(new Date());
        make2.setModel("Corolla");
        make2.setNumber("JTDKM20E100089120");
        make2.setMass(1205);
        make2.setCategory("M1");
        make2.setHomologation("e11*2001/116*0180*04");
        make2.setNumberOfAxles(2);
        make2.setMaxWeightOfTrailerWithBrakes(1000);
        make2.setGetMaxWeightOfTrailerWithoutBrakes(450);
        make2.setFuelType("P");
        make2.setMaxEnginePower(71);
        make2.setSeatsNumber(5);

    }
}
