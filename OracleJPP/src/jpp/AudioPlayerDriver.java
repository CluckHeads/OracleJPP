package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Driver Class: AudioPlayerDriver
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       Driver class for AudioPlayer that tests the functionality of the
                AudioPlayer class
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public class AudioPlayerDriver {

  /**
   * Method to test the functionality of the AudioPlayer class.
   * @param args - provides arguments for the String data type.
   */
  public static void main(String args[]) {

    //Creates AudioPlayer ap1 to allow for printing and testing
    AudioPlayer ap1 = new AudioPlayer("iPod Nano", "MP3");
    System.out.println(ap1.toString() + "\n");

    //Creates AudioPlayer ap2 to allow for printing and testing
    AudioPlayer ap2 = new AudioPlayer("iPod Shuffle", "MP3");
    System.out.println(ap2.toString() + "\n");

    ap1.play();
    ap1.stop();
    ap1.next();
    ap1.previous();

  }

}
