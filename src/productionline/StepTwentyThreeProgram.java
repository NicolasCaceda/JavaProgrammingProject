package productionline;

import java.util.ArrayList;
import java.util.Scanner;

public class StepTwentyThreeProgram {

  private static ArrayList<Product> products = new ArrayList<>();
  private static Scanner read = new Scanner(System.in);
  private static int selection;

  public static void main(String[] args) {

    System.out.println("Hello and welcome to OraclProduction Ltd.");
    boolean stillActive = true;

    while (stillActive) {
      System.out.println("-------------------------------");
      System.out.println("What would you like to do?");
      System.out.println("Add a new product - 1");
      System.out.println("See product statistics - 2");
      System.out.println("Quit - 3");
      System.out.print("Please enter a number: ");

      chooseANumber();
      selection = read.nextInt();

      switch (selection) {
        case 1:
          addProduct();
          break;
        case 2:
          seeStats();
          break;
        case 3:
          stillActive = false;
          break;
        default:
          System.out.println("Please select one of these numbers: 1, 2, or 3.");
      }


    }
  }

  private static void seeStats() {
    for (Product P : products) {
      System.out.println(P.serialNumber + " " + P);
    }
    System.out.println(products.size() + " Items have been created");
  }

  private static void addProduct() {
    boolean stillActive = true;
    while (stillActive) {
      System.out.println("Add audio player - 1");
      System.out.println("Add movie player - 2");
      System.out.println("Back - 3");

      chooseANumber();
      selection = read.nextInt();

      switch (selection) {
        case 1:
          addAudioPlayer(requestAmount());
          break;
        case 2:
          addMoviePlayer(requestAmount());
          break;
        case 3:
          stillActive = false;
        default:
          System.out.println("Please select one of these numbers: 1 or 2.");
      }
    }
  }

  private static int requestAmount() {
    System.out.println("How many would you like to add?");
    chooseANumber();
    return read.nextInt();
  }

  private static void addAudioPlayer(int numberOfProduct) {
    for (int i = 0; i < numberOfProduct; i++) {
      read.nextLine();
      System.out.println("Name of product: ");
      String name = read.nextLine();
      System.out.println("AudioSpec: ");
      String audioSpec = read.nextLine();
      products.add(new AudioPlayer(name, audioSpec));
      System.out.println(name + " Added.");
    }
  }

  private static void addMoviePlayer(int numberOfProduct) {
    for (int i = 0; i < numberOfProduct; i++) {
      read.nextLine();
      System.out.println("Name of product: ");
      String name = read.nextLine();
      System.out.println("Screen Resolution: ");
      String resolution = read.nextLine();
      System.out.println("Refresh Rate: ");
      String refreshRate = read.nextLine();
      System.out.println("Response Time: ");
      String responseTime = read.nextLine();
      System.out.println("LCD - 1");
      System.out.println("LED - 2");

      chooseANumber();
      selection = read.nextInt();

      switch (selection) {
        case 1:
          products.add(new MoviePlayer(name,
              new Screen(resolution, Integer.parseInt(refreshRate), Integer.parseInt(responseTime)),
              MonitorType.LCD));
          break;
        case 2:
          products.add(new MoviePlayer(name,
              new Screen(resolution, Integer.parseInt(refreshRate), Integer.parseInt(responseTime)),
              MonitorType.LED));
          break;
        default:
          System.out.println("Defaulted to LCD");
      }

      System.out.println(name + " Added.");
    }
  }

  private static void chooseANumber() {
    while (!read.hasNextInt()) {
      System.out.println("Not A Number.");
      read.nextLine();
      read.nextLine();
      System.out.print("Please enter a number: ");
    }
  }

}
