package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Class: EmployeeInfo
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       will allow the user to input their full name and then create a
                user id of their first initial and surname
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p = Pattern.compile("([A-Z])([a-z])([a-z])([a-z])([0-9])([0-9])");
  private Scanner scanner = new Scanner(System.in);

  /**
   * Constructor to get employee info from users.
   */
  public EmployeeInfo() {
    setName();
    // setDeptId;
  }

  public StringBuilder getName(){
    return name;
  }

  public String getCode(){
    return code;
  }

  /**
   * Method to set the name.
   * Calls createEmployeeCode to convert name to ID.
   */
  private void setName(){
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  /**
   * Method to check if the name entered is valid and will then convert it to an employee ID
   * @param name - Name that will be converted to an ID.
   */
  private void createEmployeeCode(StringBuilder name){
    if (checkName(name) == true) { //valid and contains space
      //code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
      code = name.substring(0,1) + name.substring(name.indexOf(" ") + 1);
    } else { // no space
      code = "guest";
    }
  }

  private String inputName(){
    System.out.println("Please enter your first and last name: ");
    String nameString = scanner.nextLine();

    return nameString;
  }

  private boolean checkName(StringBuilder name){
    if (name.indexOf(" ") != -1) {
      return true;
    } else {
      return false;
    }
  }

  public String getDeptId() {
    System.out.println("Please enter the department ID: ");
    String deptId = scanner.nextLine();
    return deptId;
  }

  private void setDeptId() {
    deptId = getDeptId();
    if (validId(deptId) == false) {
      deptId = "None01";
    } else {
      deptId = reverseString(getId());
    }
  }

  private String getId() {
    return deptId;
  }

  private boolean validId(String ID) {
    Matcher m = p.matcher(ID);
    boolean b = m.matches();

    if (b == true) {
      return true;
    } else {
      return false;
    }
  }

  private String reverseString(String ID) {
    if (ID.isEmpty()) {
      return ID;
    } else {
      return reverseString(ID.substring(1)) + ID.charAt(0);
    }
  }

  public String toString() {
    return "Employee Code : " + code +
            "\n Department ID : " + deptId + "\n";
  }

}
