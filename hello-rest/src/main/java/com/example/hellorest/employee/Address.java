package com.example.hellorest.employee;

import java.util.Objects;

public class Address{
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(suite, address.suite) && Objects.equals(city, address.city) && Objects.equals(zipcode, address.zipcode) && Objects.equals(geo, address.geo);
    }

    public Address() {
    }

    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }

    public String getZipcode(){
        return zipcode;
    }

    public void setGeo(Geo geo){
        this.geo = geo;
    }

    public Geo getGeo(){
        return geo;
    }

    public void setSuite(String suite){
        this.suite = suite;
    }

    public String getSuite(){
        return suite;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getStreet(){
        return street;
    }
}
