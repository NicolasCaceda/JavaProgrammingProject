package sample;

//Nicolas Caceda
//a driver class

public class MoviePlayerDriver {

  /**
   * test driver for MoviePlayer.
   * @param args main method
   */
  public static void main(String[] args) {
    MoviePlayer testMoviePlayer = new MoviePlayer("Name Test",
        new Screen("640x800", 60, 1),
        MonitorType.LCD);

    System.out.println(testMoviePlayer.toString());
    testMoviePlayer.next();
    testMoviePlayer.play();
    testMoviePlayer.previous();
    testMoviePlayer.stop();
  }
}
