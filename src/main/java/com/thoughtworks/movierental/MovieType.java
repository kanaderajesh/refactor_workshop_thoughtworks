package com.thoughtworks.movierental;


public abstract class MovieType {

    public static final int BASE_RENTER_PONIT = 1;

    public abstract double amount(int daysRented);
    int frequentRenterPoints(int daysRented) { return BASE_RENTER_PONIT;}
}
