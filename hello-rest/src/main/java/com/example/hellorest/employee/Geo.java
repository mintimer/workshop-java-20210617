package com.example.hellorest.employee;

import java.util.Objects;

public class Geo{
    private String lng;
    private String lat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geo geo = (Geo) o;
        return Objects.equals(lng, geo.lng) && Objects.equals(lat, geo.lat);
    }

    public Geo() {
    }

    public Geo(String lng, String lat) {
        this.lng = lng;
        this.lat = lat;
    }

    public void setLng(String lng){
        this.lng = lng;
    }

    public String getLng(){
        return lng;
    }

    public void setLat(String lat){
        this.lat = lat;
    }

    public String getLat(){
        return lat;
    }
}
