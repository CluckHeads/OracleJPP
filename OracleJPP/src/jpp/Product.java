package jpp;

import java.util.Date;

/*
-------------------------------------------------------------------------------
  Type:       Abstract Class: Product - Implementing: Interface Item
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       Will implement the basic functionality that all items on a
                production line should have
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

//   Abstract class called Product that implements the interface and the basic
//   functionality that all items on a production line should have
public abstract class Product implements Item, Comparable<Product> {

  // Fields
  private Date manufacturedOn;
  private String name;
  private int serialNumber;
  private String manufacturer = Item.manufacturer;

  // Setting the currentProductionNumber to 1. The first serial number
  //    needs to be 1, cannot be 0.
  private static int currentProductionNumber = 1;

  /**
   * Default constructor holding generic values.
   */
  public Product() {
    name = "Generic";
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();
  }

  // Create a constructor
  public Product(String n) {
    // take in the name of the product and set this to the field variable name.
    name = n;
    // Assign a serial number from the current production number
    //  currentProductionNumber should be incremented
    serialNumber = currentProductionNumber++;
    // Set manufacturedOn as the current date and time
    manufacturedOn = new Date();
  }

  // serialNumber = prodNumber
  public void setProductionNumber(int prodNumber) {
    currentProductionNumber = prodNumber;
  }

  // Implementing getters and setters
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufacturedDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public static int getCurrentProductionNumber() {
    return currentProductionNumber;
  }

  // toString() to make printing easier
  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
            + "Serial Number : " + serialNumber + "\n"
            + "Date : " + manufacturedOn + "\n"
            + "Name : " + name + "\n";
  }

  //Implementing the compareTo() methods
  public int compareTo(Item o) {
    return 0;
  }

}
