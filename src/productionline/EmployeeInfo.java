package productionline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern ppp = Pattern.compile("[A-Z][a-z][a-z][a-z][0-9][0-9]");
  private Scanner in;


  /**
   * Constructor creates the info of the employee.
   */
  public EmployeeInfo() {
    in = new Scanner(System.in, "UTF-8");
    setName();
    setDeptId();
    in.close();
  }

  /**
   * Gets the name.
   *
   * @return returns the name.
   */
  public StringBuilder getName() {
    return this.name;
  }

  /**
   * Gets the code.
   *
   * @return returns the code.
   */
  public String getCode() {
    return this.code;
  }

  /**
   * Sets the name.
   */
  private void setName() {
    this.name = new StringBuilder(inputName());
  }

  /**
   * If a valid name is given then createEmployeeCode() is used to take the first initial from the
   * first name and add it to the full surname to create the code.
   *
   * @param name Full name of employee.
   */
  private void createEmployeeCode(StringBuilder name) {
    int indexOfSpace = name.indexOf(" ");
    char firstNameInitial = name.charAt(0);
    String lastNameInitial = name.substring(++indexOfSpace, name.length());
    this.code = firstNameInitial + lastNameInitial;
  }

  /**
   * Get a name (firstname and surname) as a single input from the user before checkName() is used.
   *
   * @return Full name of a person.
   */
  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    StringBuilder fullName = new StringBuilder(in.nextLine());
    if (checkName(fullName)) {
      createEmployeeCode(fullName);
    } else {
      this.code = "guest";
    }
    return fullName.toString();
  }

  /**
   * used to make sure that the name supplied has a space in it.
   *
   * @param name Full name of Person.
   * @return true or false if name contains a space.
   */
  private boolean checkName(StringBuilder name) {
    return name.toString().contains(" ");
  }

  /**
   * get the id from the user.
   *
   * @return Department id
   */
  private String getDeptId() {
    System.out.print("Please enter the department ID: ");
    String departmentId = in.nextLine();
    if (validId(departmentId)) {
      return departmentId;
    }
    return "None01";
  }

  /**
   * sets the department id.
   */
  private void setDeptId() {
    this.deptId = getDeptId();
  }

  /**
   * Gets the department id.
   *
   * @return department id
   */
  private String getId() {
    return this.deptId;
  }

  /**
   * Tests if input is valid for the ID.
   *
   * @param id Is going to be checked if valid.
   * @return returns true if valid; false if not valid
   */
  private boolean validId(String id) {
    Matcher m = ppp.matcher(id);
    return m.matches();
  }

  /**
   * recursive method that this program awkwardly asks for.
   *
   * @param id the id to be revered
   * @return a reversed id
   */
  private String reverseString(String id) {
    if ((null == id) || id.length() <= 1) {
      return id;
    }
    return reverseString(id.substring(1)) + id.charAt(0);
  }

  /**
   * overrided toString method.
   *
   * @return returns employee code and department number as a string
   */
  @Override
  public String toString() {
    return "Employee Code: " + code
        + '\n' + "Department Number: " + deptId;
  }


}

