package productionline;

import java.util.ArrayList;

public class TestProductionLine {

  public static void main(String[] args) {
    EmployeeInfo employeeOne = new EmployeeInfo();


    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);


    ProcessFiles processFiles = new ProcessFiles();
    try {
      processFiles.writeFile(employeeOne);
      processFiles.writeFile(products);
    }catch (Exception ex){
      System.out.println("NoFile.");
    }
  }

}
