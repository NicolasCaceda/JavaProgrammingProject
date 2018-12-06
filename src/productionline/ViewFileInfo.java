package productionline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewFileInfo {

  static Scanner reader;

  public static void main(String[] args) {
    try {
      reader = new Scanner(new File("C:/LineTests/TestResults.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }

    while (reader.hasNextLine()){
      System.out.println(reader.nextLine());
    }
  }

}
