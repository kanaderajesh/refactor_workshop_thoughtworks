package com.thoughtworks.movierental;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RenterPointTest {

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
    public void frequentRenterPointsForNewReleaseGreaterThanTwoDays()  {
        Rental rental = new Rental(newReleaseMovie,4);
        assertEquals(2,rental.frequentRenterPoints());
    }

    @Test
    public void frequentRenterPointsForNewReleaseMovieOneDay()  {
        Rental rental = new Rental(newReleaseMovie,1);
        assertEquals(1,rental.frequentRenterPoints());
    }

    @Test
    public void frequentRenterPointsForRegularMovieOneDay()  {
        Rental rental = new Rental(regularMovie,1);
        assertEquals(1,rental.frequentRenterPoints());
    }

    @Test
    public void frequentRenterPointsForChildrenMovieOneDay()  {
        Rental rental = new Rental(childrensMovie,1);
        assertEquals(1,rental.frequentRenterPoints());
    }
    @Test
    public void frequentRenterPointsForBluerayMovieOneDay()  {
        Rental rental = new Rental(bluerayMovie,1);
        assertEquals(3,rental.frequentRenterPoints());
    }


}