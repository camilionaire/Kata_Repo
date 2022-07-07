package edu.pdx.cs410J.teamAwesomeSauce;


/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static String compute(String aString) {
    int pNum = Integer.parseInt(aString);
    String startString = "";
//    StringBuilder result = new StringBuilder();
    if (pNum % 3 == 0) {
//      System.out.println("Foo");
//      startString += "Foo";
      startString = startString.concat("Foo");
//      result.append("Foo");
    }
    if (pNum % 5 == 0) {
//      startString += "Bar";
//      result.append("Bar");
      startString = startString.concat("Bar");
    }
//    if (result.toString().equals("")) {
    if (! startString.equals("")) {
//      return result.toString();
      return startString;
    } else {
      return aString;
    }
  }

  public static void main(String[] args) {

    System.out.println(compute("1"));
    System.out.println(compute("3"));
    System.err.println("Missing command line arguments");



    }
}