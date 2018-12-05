package productionLine;

//Nicolas Caceda
//class called MoviePlayer that extends Product and implements MultimediaControl
//methods from the MultimediaControl interface in a similar fashion to the audio player.

public class MoviePlayer extends Product implements MultiMediaControl {

  Screen screen;
  MonitorType monitorType;

  /**
   * MoviePlayer Constructor.
   * @param name name String
   * @param screen screen Screen
   * @param monitorType monitorType MonitorType
   */
  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");

  }

  @Override
  public void previous() {
    System.out.println("Previous");

  }

  @Override
  public void next() {
    System.out.println("Next");

  }

  @Override
  public String toString() {
    return super.toString()
        + screen.toString()
        + "Monitor Type  : " + monitorType.toString();
  }
}
