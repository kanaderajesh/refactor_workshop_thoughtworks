package com.thoughtworks.movierental;

class Rental {
  private Movie movie;
  private int daysRented;

  public Rental(Movie movie, int daysRented) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public int getDaysRented() {
    return daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  double amount() {
    return movie.amount(daysRented);
  }


  int frequentRenterPoints() {

     return movie.frequentRenterPoints(daysRented);
  }


}