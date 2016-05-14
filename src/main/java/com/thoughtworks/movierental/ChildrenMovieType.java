package com.thoughtworks.movierental;

public class ChildrenMovieType extends MovieType {

    public static final double BASE_AMOUNT_FOR_CHILDREN_MOVIE = 1.5;
    public static final double AMOUNT_PER_EXTRA_DAY_FOR_CHILDREN_MOVIE = 1.5;
    @Override
    public double amount(int daysRented) {
        return amountForChildrenMovie(daysRented);
    }



    private double amountForChildrenMovie(int daysRented) {
        if (daysRented > 3)
            return BASE_AMOUNT_FOR_CHILDREN_MOVIE + extraAmountForChildrenMovie(daysRented);
        return BASE_AMOUNT_FOR_CHILDREN_MOVIE;
    }

    private double extraAmountForChildrenMovie(int daysRented) {
        return (daysRented - 3) * AMOUNT_PER_EXTRA_DAY_FOR_CHILDREN_MOVIE;
    }
}
