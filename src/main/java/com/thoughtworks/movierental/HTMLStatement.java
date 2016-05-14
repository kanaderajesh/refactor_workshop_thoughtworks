package com.thoughtworks.movierental;

/**
 * Created by kanader on 5/13/2016.
 */
public class HTMLStatement extends Statement
{

    @Override
    protected String lineItem(Rental rental) {
        return  rental.getMovie().getTitle() + " " +
                rental.amount() + "</br>\n";
    }

    @Override
    protected String header(String name) {
        return "<h1>Rental Record for <b>" + name + "</b></h1></br>\n";
    }

    @Override
    protected String footer(Double amount, int points) {
        return  "Amount owed is <b>" + amount + "</b></br>\n"
                + "You earned <b>" + points + "</b>"
                + " frequent renter points";
    }
}
