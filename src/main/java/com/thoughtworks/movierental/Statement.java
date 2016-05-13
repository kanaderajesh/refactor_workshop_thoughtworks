package com.thoughtworks.movierental;

import java.util.List;

/**
 * Created by kanader on 5/13/2016.
 */
public abstract class Statement {

    private String body(List<Rental> rentals) {
        String result = "";
        for (Rental rental : rentals) {
            result += lineItem(rental);
        }
        return result;
    }

    protected abstract String lineItem(Rental rental);

    protected abstract String header(String name);

    protected abstract String footer(Double amount, int points);

    public String print(String name, List<Rental> rentals, double amount , int point) {
        return header(name) + body(rentals) + footer(amount,point);
    }
}
