package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Class: MoviePlayer
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       class that will allow us to capture the details of an movie
                player
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public class MoviePlayer extends Product implements MultimediaControl {
  // Fields
  private Screen screen;
  private MonitorType monitorType;

  @Override
  public int compareTo(Product o) {
    return 0;
  }

  /**
   * Default constructor holding generic data.
   */
  public MoviePlayer() {
    super();
    screen = new Screen();
    monitorType = MonitorType.LCD;
  }

  /**
   *
   * @param n - The name of the movie player (String value).
   * @param screen - Data on the screen of the movie player (from Screen class).
   * @param monitorType - monitor data for the monitor.
   */
  public MoviePlayer(String n, Screen screen, MonitorType monitorType) {
    super(n);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  /**
   * Method to print that the movie player is currently playing.
   */
  @Override
  public void play() {
    System.out.println("Playing.");
  }

  /**
   * Method to print that the movie player is currently stopping.
   */
  @Override
  public void stop() {
    System.out.println("Stopping.");
  }

  /**
   * Method to print that the movie player is currently going to previous.
   */
  @Override
  public void previous() {
    System.out.println("Going to previous.");
  }

  /**
   * Method to print that the movie player is currently going to next.
   */
  @Override
  public void next() {
    System.out.println("Going to next.");
  }

//  @Override
//  public Date getManufacturedOn() {
//    return null;
//  }

  /**
   * Method to print out product, screen, and movie player data.
   * @return - Returns the product and movie player info.
   */
  @Override
  public String toString() {
    return super.toString() + screen.toString() + "Monitor details: " + monitorType + "\n";
  }

}
