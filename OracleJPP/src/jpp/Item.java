package jpp;

import java.util.Date;

/*
-------------------------------------------------------------------------------
  Type:       Interface: Item
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       Contains constant methods that every "Item" would need to
                contain
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public interface Item {

  //    constant called manufacturer that would be set to “OracleProduction”
  String manufacturer = "OracleProduction";

  //     Method setProductionNumber that would have one integer parameter
  void setProductionNumber(int prodNumber);

  //     Method setName that would have one String parameter
  void setName(String name);

  //     Method getName that would return a String
  String getName();

  //     Method getSerialNumber that would return an int
  int getSerialNumber();

}
