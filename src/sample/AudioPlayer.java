package sample;

public class AudioPlayer extends Product implements MultiMediaControl {

  String audioSpecification;
  ItemType mediaType;

  /**
   * Constructor for AudioPlayer.
   * @param name Audio Player Name
   * @param audioSpecification Audio Player Specification
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AU;
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
        + "Audio Spec    : " + this.audioSpecification + '\n'
        + "Type          : " + this.mediaType;
  }
}
