package sample;

//Nicolas Caceda
//9.29.2018
//Abstract class that implements the sample.Item interface
//sample.Product will implement the basic functionality that all items on a production line should
// have

import java.util.Date;

abstract class Product implements Item {

  //did not use access modifiers because the steps did not ask for any
  int serialNumber;
  String manufacturer;
  Date manufacturedOn;
  String name;

  //Integer class variable called currentProductionNumber. This will store the next number to be
  //assigned to serialNumber.
  private static int currentProductionNumber;


  //A constructor that will take in the name of the product and set this to the field variable name.
  //Assign a serial number from the currentProductionNumber. The
  //currentProductionNumber will be incremented in readiness for the next instance.
  //Set manufacturedOn as the current date and time.
  public Product(String name) {
    manufacturer = Item.MANUFACTURER;
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();
  }

  //Everything that MUST be implemented from the interface.
  @Override
  public void setProductionNumber(int productionNumber) {
    serialNumber = productionNumber;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  //Will return the data of the product
  @Override
  public String toString() {
    return "Manufacturer  : " + manufacturer + '\n'
        + "Serial Number : " + serialNumber + '\n'
        + "Date          : " + manufacturedOn + '\n'
        + "Name          : " + name + '\n';
  }
}