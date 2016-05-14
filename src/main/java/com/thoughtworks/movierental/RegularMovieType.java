package com.thoughtworks.movierental;


public class RegularMovieType extends MovieType {
    public static final int BASE_AMOUNT_FOR_REGULAR_MOVIE = 2;
    public static final double AMOUNT_PER_EXTRA_DAY_FOR_REGULAR_MOVIE = 1.5;
    @Override
    public double amount(int daysRented) {
        return amountForRegularMovie(daysRented);
    }

    private double amountForRegularMovie(int daysRented) {
        if (daysRented > 2)
            return BASE_AMOUNT_FOR_REGULAR_MOVIE + extraAmountForRegularMovie(daysRented);
        return BASE_AMOUNT_FOR_REGULAR_MOVIE;
    }

    private double extraAmountForRegularMovie(int daysRented) {
        return (daysRented - 2) * AMOUNT_PER_EXTRA_DAY_FOR_REGULAR_MOVIE;
    }
}
