package productionline;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {

  private Path p1;
  private Path p2;
  private Path p3;

  ProcessFiles() {
    p1 = Paths.get("C:/LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p1.resolve(p2);
    createDirectory();
  }

  private void createDirectory() {
    try {
      if (Files.notExists(p1)) {
        Files.createDirectory(p1);
      }
    } catch (Exception ex) {
      System.out.println("ERROR PROBLEM CREATING DIRECTORY!!");
    }
  }

  void writeFile(EmployeeInfo emp) throws IOException {
    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);
    printWriter.println(emp.toString());
    printWriter.close();
  }

  void writeFile(ArrayList<Product> products) throws IOException {
    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);
    printWriter.println(products.toString());
    printWriter.close();
  }
}
