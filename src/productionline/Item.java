package productionline;

//Nicolas Caceda
//9.29.2018
//Interface for Items. A binding contract that all items must implement these.

import java.util.Date;

public interface Item {

  //Constant
  String MANUFACTURER = "OracleProduction";

  //Methods for all future items
  void setProductionNumber(int productionNumber);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();

}
