package com.github.rzabilowicz.Patronage2018Task1.Cars;



import java.util.Date;

//identyfikacja pojazdu zgodna z dowoderm rejestracyjnym

public class Car {

    //ZMIENNE
    private String number;
    private Date firstRegisterDate;
    private String brand;
    private String type;
    private String model;
    private String autoId;
    private int mass;
    private Date expirationDate;
    private Date releaseDate;
    private String category;
    private String homologation;
    private int numberOfAxles; //liczba osi
    private int maxWeightOfTrailerWithBrakes;
    private int getMaxWeightOfTrailerWithoutBrakes;
    private int engineCapacity;
    private int maxEnginePower;
    private String fuelType;
    private int seatsNumber;
    private int standingPlaces;

    public int ownerId;


    //zdefiniowanie Car

    public Car(String number, Date firstRegisterDate, int ownerId,
               String brand, String type, String model, String autoId,
               int mass, Date expirationDate, Date releaseDate,
               String category, String homologation, int numberOfAxles,
               int maxWeightOfTrailerWithBrakes, int getMaxWeightOfTrailerWithoutBrakes,
               int engineCapacity, int maxEnginePower, String fuelType,
               int seatsNumber, int standingPlaces) {
        this.autoId = autoId;
        this.brand = brand;
        this.category = category;
        this.engineCapacity = engineCapacity;
        this.expirationDate = expirationDate;
        this.firstRegisterDate = firstRegisterDate;
        this.fuelType = fuelType;
        this.getMaxWeightOfTrailerWithoutBrakes = getMaxWeightOfTrailerWithoutBrakes;
        this.homologation = homologation;
        this.mass = mass;
        this.maxEnginePower = maxEnginePower;
        this.maxWeightOfTrailerWithBrakes = maxWeightOfTrailerWithBrakes;
        this.model = model;
        this.number = number;
        this.numberOfAxles = numberOfAxles;
        this.ownerId = ownerId;
        this.releaseDate = releaseDate;
        this.seatsNumber = seatsNumber;
        this.standingPlaces = standingPlaces;
        this.type = type;
    }
    //GETTERY I SETTERY

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getFirstRegisterDate() {
        return firstRegisterDate;
    }

    public void setFirstRegisterDate(Date firstRegisterDate) {
        this.firstRegisterDate = firstRegisterDate;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAutoId() {
        return autoId;
    }

    public void setAutoId(String autoId) {
        this.autoId = autoId;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getHomologation() {
        return homologation;
    }

    public void setHomologation(String homologation) {
        this.homologation = homologation;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public int getMaxWeightOfTrailerWithBrakes() {
        return maxWeightOfTrailerWithBrakes;
    }

    public void setMaxWeightOfTrailerWithBrakes(int maxWeightOfTrailerWithBrakes) {
        this.maxWeightOfTrailerWithBrakes = maxWeightOfTrailerWithBrakes;
    }

    public int getGetMaxWeightOfTrailerWithoutBrakes() {
        return getMaxWeightOfTrailerWithoutBrakes;
    }

    public void setGetMaxWeightOfTrailerWithoutBrakes(int getMaxWeightOfTrailerWithoutBrakes) {
        this.getMaxWeightOfTrailerWithoutBrakes = getMaxWeightOfTrailerWithoutBrakes;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getMaxEnginePower() {
        return maxEnginePower;
    }

    public void setMaxEnginePower(int maxEnginePower) {
        this.maxEnginePower = maxEnginePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public void setStandingPlaces(int standingPlaces) {
        this.standingPlaces = standingPlaces;
    }


    ///////////////////////////////////NOWY SAMOCHÓD//////////////////////////////////////

    public Car(CarRegister newCar) {
        this.ownerId = newCar.ownerId;
        //CarOwner.checkOwner(newCar.ownerId);
        this.autoId = newCar.autoId;
        this.brand = newCar.brand;
        this.category = newCar.category;
        this.engineCapacity = newCar.engineCapacity;
        this.expirationDate = newCar.expirationDate;
        this.firstRegisterDate = newCar.firstRegisterDate;
        this.fuelType = newCar.fuelType;
        this.getMaxWeightOfTrailerWithoutBrakes = newCar.getMaxWeightOfTrailerWithoutBrakes;
        this.homologation = newCar.homologation;
        this.mass = newCar.mass;
        this.maxEnginePower = newCar.maxEnginePower;
        this.maxWeightOfTrailerWithBrakes = newCar.maxWeightOfTrailerWithBrakes;
        this.model = newCar.model;
        this.number = newCar.number;
        this.numberOfAxles = newCar.numberOfAxles;
        this.releaseDate = newCar.releaseDate;
        this.seatsNumber = newCar.seatsNumber;
        this.standingPlaces = newCar.standingPlaces;
        this.type = newCar.type;



       // this.ownerId = newCar.ownerId;
        // newCar.ownerId.isOwner();
    }


    public static class CarRegister {


        //ZMIENNE
        private String number;
        private Date firstRegisterDate;
        private int ownerId;
        private String brand;
        private String type;
        private String model;
        private String autoId;
        private int mass;
        private Date expirationDate;
        private Date releaseDate;
        private String category;
        private String homologation;
        private int numberOfAxles; //liczba osi
        private int maxWeightOfTrailerWithBrakes;
        private int getMaxWeightOfTrailerWithoutBrakes;
        private int engineCapacity;
        private int maxEnginePower;
        private String fuelType;
        private int seatsNumber;
        private int standingPlaces;

// pozyskanie danych  - utworzenie nowych do ewidencji

        public CarRegister setNumber(String number) {
            this.number = number;
            return this;
        }

        public CarRegister setFirstRegisterDate(Date firstRegisterDate) {
            this.firstRegisterDate = firstRegisterDate;
            return this;
        }

        public CarRegister setOwnerId(int ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public CarRegister setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarRegister setType(String type) {
            this.type = type;
            return this;
        }

        public CarRegister setModel(String model) {
            this.model = model;
            return this;
        }

        public CarRegister setAutoId(String autoId) {
            this.autoId = autoId;
            return this;
        }

        public CarRegister setMass(int mass) {
            this.mass = mass;
            return this;
        }

        public CarRegister setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public CarRegister setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public CarRegister setCategory(String category) {
            this.category = category;
            return this;
        }

        public CarRegister setHomologation(String homologation) {
            this.homologation = homologation;
            return this;
        }

        public CarRegister setNumberOfAxles(int numberOfAxles) {
            this.numberOfAxles = numberOfAxles;
            return this;
        }

        public CarRegister setMaxWeightOfTrailerWithBrakes(int maxWeightOfTrailerWithBrakes) {
            this.maxWeightOfTrailerWithBrakes = maxWeightOfTrailerWithBrakes;
            return this;
        }

        public CarRegister setGetMaxWeightOfTrailerWithoutBrakes(int getMaxWeightOfTrailerWithoutBrakes) {
            this.getMaxWeightOfTrailerWithoutBrakes = getMaxWeightOfTrailerWithoutBrakes;
            return this;
        }

        public CarRegister setEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public CarRegister setMaxEnginePower(int maxEnginePower) {
            this.maxEnginePower = maxEnginePower;
            return this;
        }

        public CarRegister setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public CarRegister setSeatsNumber(int seatsNumber) {
            this.seatsNumber = seatsNumber;
            return this;
        }

        public CarRegister setStandingPlaces(int standingPlaces) {
            this.standingPlaces = standingPlaces;
            return this;
        }

        public Car build() {
            return new Car(this);
        }


    }



}
