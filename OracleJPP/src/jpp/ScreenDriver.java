package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Driver Class: ScreenDriver
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       Driver class for Screen that tests the functionality of the
                screen class
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public class ScreenDriver {

  public static void main(String args[]) {

    Screen s1 = new Screen("HD", 20, 30);
    System.out.println(s1.toString() + "\n");
    Screen s2 = new Screen("RGB", 30, 60);
    System.out.println(s2.toString() + "\n");

  }

}
