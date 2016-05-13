package com.thoughtworks.movierental;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testCustomerTextStatement() {
        Movie jungleBook = new Movie("Jungle Book", Movie.CHILDRENS);
        Movie ddlj = new Movie("DDLJ", Movie.REGULAR);
        Movie civilWar = new Movie("Civil War", Movie.NEW_RELEASE);
        Customer customer = new Customer("Mohan");
        customer.addRental(new Rental(jungleBook,2));
        customer.addRental(new Rental(ddlj,5));
        customer.addRental(new Rental(civilWar,7));
        assertEquals("Rental Record for Mohan\n" +
                "\tJungle Book\t1.5\n" +
                "\tDDLJ\t6.5\n" +
                "\tCivil War\t21.0\n" +
                "Amount owed is 29.0\n" +
                "You earned 4 frequent renter points", customer.statement());

    }

    @Test
    public void testCustomerHTMLStatement() {
        Movie jungleBook = new Movie("Jungle Book", Movie.CHILDRENS);
        Movie ddlj = new Movie("DDLJ", Movie.REGULAR);
        Movie civilWar = new Movie("Civil War", Movie.NEW_RELEASE);
        Customer customer = new Customer("Mohan");
        customer.addRental(new Rental(jungleBook,2));
        customer.addRental(new Rental(ddlj,5));
        customer.addRental(new Rental(civilWar,7));


        assertEquals("<h1>Rental Record for <b>Mohan</b></h1></br>\n" +
                "Jungle Book 1.5</br>\n" +
                "DDLJ 6.5</br>\n" +
                "Civil War 21.0</br>\n" +
                "Amount owed is <b>29.0</b></br>\n" +
                "You earned <b>4</b> frequent renter points", customer.htmlStateMent());

    }

}