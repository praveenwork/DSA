package com.interview.preparation.java.streams;

import lombok.*;


@Setter
@Getter
public class Hotel {
    private String hotelName;
    private String city;
    private int noOfRooms;
    private double price;

    public Hotel(){}
    public Hotel(String hotelName, String city, int noOfRooms, double price){
        this.hotelName = hotelName;
        this.city = city;
        this.noOfRooms = noOfRooms;
        this.price = price;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", city='" + city + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", price=" + price +
                '}';
    }
}
