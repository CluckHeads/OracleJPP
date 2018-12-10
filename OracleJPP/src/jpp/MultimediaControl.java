package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Interface:  MultimediaControl
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       contains the methods that every multimedia device will need to
                function
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public interface MultimediaControl {

  /**
   * Method to play media.
   */
  void play();

  /**
   * Method to stop media.
   */
  void stop();

  /**
   * Method to play next media.
   */
  void next();

  /**
   * Method to play previous media.
   */
  void previous();

}