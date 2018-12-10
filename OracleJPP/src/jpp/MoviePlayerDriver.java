package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Driver Class: MoviePlayerDriver
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       Driver class for MoviePlayer that tests the functionality of the
                MoviePlayer class
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public class MoviePlayerDriver {

  public static void main(String args[]) {

    //setting the Screen s1 and s2 to allow for the creation of a MoviePlayer
    Screen s1 = new Screen("HD", 20, 30);
    Screen s2 = new Screen("RGB", 30, 60);

    //Creates and prints a test of mp1 (MoviePlayer1)
    MoviePlayer mp1 = new MoviePlayer("iPad", s1, MonitorType.LCD);
    System.out.println(mp1.toString() + "\n");

    //Creates and prints a test of mp2 (MoviePlayer2)
    MoviePlayer mp2 = new MoviePlayer("Galaxy Tablet", s2, MonitorType.LED);
    System.out.println(mp2.toString() + "\n");

    mp1.play();
    mp1.next();
    mp2.play();
    mp2.stop();
    mp1.previous();
    System.out.println(mp1);

  }

}
