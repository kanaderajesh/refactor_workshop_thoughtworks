package com.thoughtworks.movierental;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kanader on 5/14/2016.
 */
public class RentalTest {

    private Movie regularMovie;
    private Movie newReleaseMovie;
    private Movie childrensMovie;
    private Movie bluerayMovie;


    @Before
    public void setup() {
        regularMovie = new Movie("Django",Movie.REGULAR);
        newReleaseMovie = new Movie("Django",Movie.NEW_RELEASE);
        childrensMovie = new Movie("Django",Movie.CHILDRENS);
        bluerayMovie = new Movie("Django",Movie.BLUERAY);
    }
    
    @Test
    public void amountForRentingRegularMovieGreaterThanTwoDays()  {
        Rental rental = new Rental(regularMovie,4);
        assertEquals(5,rental.amount(),0.0);
    }
    @Test
    public void amountForRentingRegularMovieOneDay()  {
        Rental rental = new Rental(regularMovie,1);
        assertEquals(2,rental.amount(),0.0);
    }
    @Test
    public void amountForRentingRegularMovieTwoDay()  {
        Rental rental = new Rental(regularMovie,2);
        assertEquals(2,rental.amount(),0.0);
    }

    @Test
    public void amountForRentingNewReleaseMovieFourDay()  {
        Rental rental = new Rental(newReleaseMovie,4);
        assertEquals(12,rental.amount(),0.0);
    }

    @Test
    public void amountForRentingChildrenMovieOneDay()  {
        Rental rental = new Rental(childrensMovie,1);
        assertEquals(1.5,rental.amount(),0.0);
    }

    @Test
    public void amountForRentingChildrenMovieTwoDay()  {
        Rental rental = new Rental(childrensMovie,2);
        assertEquals(1.5,rental.amount(),0.0);
    }
    @Test
    public void amountForRentingChildrenMovieThreeDay()  {
        Rental rental = new Rental(childrensMovie,1);
        assertEquals(1.5,rental.amount(),0.0);
    }
    @Test
    public void amountForRentingChildrenMovieGreaterThanThreeDays()  {
        Rental rental = new Rental(childrensMovie,4);
        assertEquals(3.0,rental.amount(),0.0);
    }
    @Test
    public void amountForRentingBluerayMovieOneDay()  {
        Rental rental = new Rental(bluerayMovie,1);
        assertEquals(4,rental.amount(),0.0);
    }

}