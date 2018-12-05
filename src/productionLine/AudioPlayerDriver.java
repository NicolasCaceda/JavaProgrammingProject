package productionLine;

//Nicolas Caceda
//a driver class for AudioPlayer that will test to see whether we can instantiate occurrences of it,
//use the media controls and print out their details to the console.

public class AudioPlayerDriver {

  /**
   * AudioPlayer test driver.
   * @param args main method
   */
  public static void main(String[] args) {
    AudioPlayer audio1 = new AudioPlayer("Red", "spec");
    audio1.play();
    audio1.stop();
    audio1.previous();
    audio1.next();
    System.out.println(audio1.toString());
  }
}
