/*
Create a driver class named ViewFileInfo that will read the information from the TestResults.txt
file and display the contents to the console. Use a try statement to handle situations where the
file does not exist.
 */

package productionline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewFileInfo {

  private static Scanner reader;

  /**
   * Main method to test file.
   *
   * @param args args
   */
  public static void main(String[] args) {
    try {
      reader = new Scanner(new File("C:/LineTests/TestResults.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }

    while (reader.hasNextLine()) {
      System.out.println(reader.nextLine());
    }
  }

}
