package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Class: Main
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       Main class that allows the program to run
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  /**
   * Sets the Widgets and then prints out the information of that widget.
   *
   * @param args - provides arguments for the String data type.
   */
  public static void main(String[] args) {

    ArrayList<Product> products = new ArrayList<>();

    products = testCollection();

    Collections.sort(products);

    print(products);

  }

  //Still needs work
  public static ArrayList<Product> testCollection() {
    AudioPlayer ap1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer ap2 = new AudioPlayer("Walkman", "WAV");
    MoviePlayer mp1 = new MoviePlayer("Galaxy Tablet",
            new Screen("HD", 60, 30), MonitorType.LED);
    MoviePlayer mp2 = new MoviePlayer("iPad",
            new Screen("HD", 45, 60), MonitorType.LED);

    ArrayList<Product> products = new ArrayList<>();

    products.add(ap1);
    products.add(mp1);
    products.add(ap2);
    products.add(mp2);

    return products;
  }

  // Step 16
  // Create print method here
  public static void print(ArrayList<Product> products) {
    for(int i = 0; i < products.size(); i++) {
      System.out.println(products.get(i));
    }
  }

}



