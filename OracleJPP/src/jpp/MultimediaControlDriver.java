package jpp;

public class MultimediaControlDriver {

  public static void main(String args[]) {

    MultimediaControl ap1 = new AudioPlayer();
    MultimediaControl mp1 = new MoviePlayer();

    //Showing playing functionality
    ap1.play();
    mp1.play();

    //Showing skipping functionality
    ap1.next();
    mp1.next();

    //Showing previous functionality
    ap1.previous();
    mp1.previous();

    //Showing stopping functionality
    ap1.stop();
    mp1.stop();

  }

}
