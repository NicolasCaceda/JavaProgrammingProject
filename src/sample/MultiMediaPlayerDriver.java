package sample;

/*
Nicolas Caceda
The audio players and the movie players share the same control interface on the physical devices.
The control interface does not care if the device is a video player or an audio player. Create a
driver class that will demonstrate that any class that implements the MultimediaControl Interface
would be able to be instantiated and use its methods used no matter if it was an audio or movie
player
*/
public class MultiMediaPlayerDriver {

  /**
   * Test driver for multimedia.
   * @param args main method
   */
  public static void main(String[] args) {
    MultiMediaControl movie = new MoviePlayer("test Movie",
        new Screen("640x800", 60, 1),
        MonitorType.LCD);

    System.out.println(movie.toString());
    movie.next();
    movie.play();
    movie.previous();
    movie.stop();
    System.out.println("-----------------------");

    MultiMediaControl audio = new AudioPlayer("Test Audio",
        "Test Spec");

    System.out.println(audio.toString());
    audio.next();
    audio.play();
    audio.previous();
    audio.stop();
  }

}
