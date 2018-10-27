package sample;

//Nicolas Caceda
//a Driver class for Screen that tests the functionality of the screen class

public class ScreenDriver {

  /**
   * test driver for screen.
   * @param args main method
   */
  public static void main(String[] args) {
    Screen screen1 = new Screen("340x680", 60, 1);
    System.out.println(screen1.getRefreshRate());
    System.out.println(screen1.getResolution());
    System.out.println(screen1.getResponseTime());
    System.out.println(screen1.toString());
  }
}
