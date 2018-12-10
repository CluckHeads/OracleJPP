package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Class: Screen
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       class that will specify components of the movie players screen
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/


public class Screen implements ScreenSpec {

  // fields
  private String resolution;
  private int refreshRate;
  private int responseTime;

  // default constructor
  public Screen() {
    resolution = "Generic";
    refreshRate = 0;
    responseTime = 0;
  }

  // Overloaded constructor
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public int getRefreshRate() {
    return refreshRate;
  }

  public void setRefreshrate(int refreshRateate) {
    this.refreshRate = refreshRate;
  }

  public int getResponseTime() {
    return responseTime;
  }

  public void setResponsetime(int responseTime) {
    this.responseTime = responseTime;
  }

  public String toString() {
    return "Screen Resolution: " + resolution + "\n"
            + "Screen Refresh Rate: " + refreshRate + "\n"
            + "Screen Response Time: " + responseTime + "\n";
  }
}
