package com.thoughtworks.movierental;

public class Movie {

  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;
  public static final int BLUERAY = 3;


  private String title;
  private int code;
  private MovieType movieType;


  public Movie(String title, int code) {
    this.title = title;
    this.code = code;
    this.movieType = createMovieType();

  }
  private MovieType createMovieType() {
       switch(code){
           case NEW_RELEASE:
               return new NewReleaseMovieType();
           case CHILDRENS:
               return new ChildrenMovieType();
           case REGULAR:
               return new RegularMovieType();
           case BLUERAY:
               return new BluerayMovieType();

       }
       return null;
  }

  public int getPriceCode() {
    return code;
  }

  public void setPriceCode(int arg) {
    code = arg;
  }

  public String getTitle() {
    return title;
  }

  double amount(int daysRented) {
    return movieType.amount(daysRented);
  }
  int frequentRenterPoints(int daysRented) {

      return movieType.frequentRenterPoints(daysRented);
  }


}