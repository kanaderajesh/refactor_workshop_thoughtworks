package com.thoughtworks.movierental;

public class BluerayMovieType extends MovieType {

    public static final int AMOUNT_PER_DAY_FOR_BLUERAY_MOVIE = 4;
    public static final int RENTER_PONITS_FOR_BLUERAY_MOVIE = 3;

    @Override
    public double amount(int daysRented) {
        return amountForBluerayMovie(daysRented);
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return RENTER_PONITS_FOR_BLUERAY_MOVIE;
    }

    private double amountForBluerayMovie(int daysRented) {
        return daysRented * AMOUNT_PER_DAY_FOR_BLUERAY_MOVIE;
    }
}
