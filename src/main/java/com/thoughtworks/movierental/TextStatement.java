package com.thoughtworks.movierental;

import java.util.List;

/**
 * Created by kanader on 5/13/2016.
 */
public class TextStatement extends Statement {

    @Override
    protected String lineItem(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" +
                rental.rentalAmount() + "\n";
    }

    @Override
    protected String header(String name) {
        return "Rental Record for " + name + "\n";
    }

    @Override
    protected String footer(Double amount, int points) {
        return  "Amount owed is " + amount + "\n"
                + "You earned " + points
                + " frequent renter points";
    }

}
