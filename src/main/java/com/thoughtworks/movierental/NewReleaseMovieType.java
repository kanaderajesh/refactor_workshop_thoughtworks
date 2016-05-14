package com.thoughtworks.movierental;

public class NewReleaseMovieType extends MovieType {
    public static final int AMOUNT_PER_DAY_FOR_NEW_RELEASE_MOVIE = 3;
    @Override
    public double amount(int daysRented) {
        return amountForNewReleaseMovie(daysRented);
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return (isEligibleForBonus() && daysRented > 1) ? 2 : 1;
    }
    private boolean isEligibleForBonus(){
        return true;
    }

    private double amountForNewReleaseMovie(int daysRented) {
        return daysRented * AMOUNT_PER_DAY_FOR_NEW_RELEASE_MOVIE;
    }
}
