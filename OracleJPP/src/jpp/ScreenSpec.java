package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Interface: ScreenSpec
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       Contains constant methods that every "Screen" would need to
                contain
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/


// Create an interface called ScreenSpec.
public interface ScreenSpec {

  public String getResolution();
  public int getRefreshRate();
  public int getResponseTime();

}
