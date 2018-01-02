package com.github.rzabilowicz.Patronage2018Task1.Client;

import java.util.Date;

public class Client {

    //identyfikacja klienta zgodna z dowodem osobistym

    private String surname;
    private String names;
    private String parentsNames;
    private Date birthdayDate;
    private float pesel;
    private String bithdayCountry;
    private String whoIssued;
    private Date releaseDate;
    private Date expirationDate;

    public Integer idNumber;

    //podstawowe dane dodatkowe

    private String street;
    private String homeNumber;
    private String postCode;
    private String city;
    private String country;

    //GETTERY i SETTERY

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getParentsNames() {
        return parentsNames;
    }

    public void setParentsNames(String parentsNames) {
        this.parentsNames = parentsNames;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public float getPesel() {
        return pesel;
    }

    public void setPesel(float pesel) {
        this.pesel = pesel;
    }

    public String getBithdayCountry() {
        return bithdayCountry;
    }

    public void setBithdayCountry(String bithdayCountry) {
        this.bithdayCountry = bithdayCountry;
    }

    public String getWhoIssued() {
        return whoIssued;
    }

    public void setWhoIssued(String whoIssued) {
        this.whoIssued = whoIssued;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public Client(String surname, String names, String parentsNames,
                  Date birthdayDate, float pesel, String bithdayCountry,
                  String whoIssued, Date releaseDate, Date expirationDate,
                  Integer idNumber,

                  //dane dodatkowe
                  String street, String homeNumber, String postCode,
                  String city, String country) {

        this.surname = surname;
        this.names = names;
        this.parentsNames = parentsNames;
        this.birthdayDate = birthdayDate;
        this.pesel = pesel;
        this.bithdayCountry = bithdayCountry;
        this.whoIssued = whoIssued;
        this.releaseDate = releaseDate;
        this.expirationDate = expirationDate;
        this.idNumber = idNumber;
        this.street = street;
        this.homeNumber = homeNumber;
        this.postCode = postCode;
        this.city = city;
        this.country = country;

    }

    ////////////////////////////////TWORZENIE KLIENTA//////////////////////////

    public Client(newClient newClient) {

        this.surname = newClient.surname;
        this.names = newClient.names;
        this.parentsNames = newClient.parentsNames;
        this.birthdayDate = newClient.birthdayDate;
        this.pesel = newClient.pesel;
        this.bithdayCountry = newClient.bithdayCountry;
        this.whoIssued = newClient.whoIssued;
        this.releaseDate = newClient.releaseDate;
        this.expirationDate = newClient.expirationDate;
        this.idNumber = newClient.idNumber;

        this.street = newClient.street;
        this.homeNumber = newClient.homeNumber;
        this.postCode = newClient.postCode;
        this.city = newClient.city;
        this.country = newClient.country;

    }

    public static class newClient {

        //identyfikacja klienta zgodna z dowodem osobistym

        private String surname;
        private String names;
        private String parentsNames;
        private Date birthdayDate;
        private float pesel;
        private String bithdayCountry;
        private String whoIssued;
        private Date releaseDate;
        private Date expirationDate;

        public Integer idNumber;

        //podstawowe dane dodatkowe

        private String street;
        private String homeNumber;
        private String postCode;
        private String city;
        private String country;

        //tworzenie zasobu

        public newClient setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public newClient setNames(String names) {
            this.names = names;
            return this;
        }

        public newClient setParentsNames(String parentsNames) {
            this.parentsNames = parentsNames;
            return this;
        }

        public newClient setBirthdayDate(Date birthdayDate) {
            this.birthdayDate = birthdayDate;
            return this;
        }

        public newClient setPesel(float pesel) {
            this.pesel = pesel;
            return this;
        }

        public newClient setBithdayCountry(String bithdayCountry) {
            this.bithdayCountry = bithdayCountry;
            return this;
        }

        public newClient setWhoIssued(String whoIssued) {
            this.whoIssued = whoIssued;
            return this;
        }

        public newClient setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public newClient setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public newClient setIdNumber(Integer idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public newClient setStreet(String street) {
            this.street = street;
            return this;
        }

        public newClient setHomeNumber(String homeNumber) {
            this.homeNumber = homeNumber;
            return this;
        }

        public newClient setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public newClient setCity(String city) {
            this.city = city;
            return this;
        }

        public newClient setCountry(String country) {
            this.country = country;
            return this;
        }




    }
}
