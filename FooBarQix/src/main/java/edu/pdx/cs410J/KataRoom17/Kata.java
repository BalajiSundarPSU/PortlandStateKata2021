
package edu.pdx.cs410J.KataRoom17;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  private static String USAGE_MESSAGE = "usage: This program only accepts one integer argument";
  private  static int input;
  public static String argument;
  public static String output="";
  public static String arg;


  public static void main(String[] args) {
    arg = argument;
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      System.err.println(USAGE_MESSAGE);
      System.exit(1);
    }
    else if(args.length >1){
      System.err.println("Invalid no. of arguments.");
      System.err.println(USAGE_MESSAGE);
      System.exit(1);
    }
    else{
      try{
        argument= args[0];
        input = Integer.parseInt(args[0]);


      }
      catch(NumberFormatException ne){
        System.err.println("Invalid input format");
        System.err.println(USAGE_MESSAGE);
        System.exit(1);
      }
    }


    if(input % 3 ==0){
      output = output +"Foo";

    }
    if (input % 5 ==0){
      output = output+"Bar";


    }


    if (input % 7 ==0){
      output =output+"Qix";

    }


    for(int i=0;i<argument.length();i++) {


      if(argument.charAt(i) == '3'){
        output=output+"Foo";
      }
      if(argument.charAt(i) == '5'){
        output = output+"Bar";
      }
      if(argument.charAt(i) == '7'){
        output = output + "Qix";
      }
      if (argument.charAt(i) == '0') {
        output =output+"*";
      }
      if(argument.charAt(i) !='3' && argument.charAt(i) !='5' && argument.charAt(i) !='7' && argument.charAt(i) !='0'){
        output = output + argument.charAt(i);
      }
    }

    System.out.println(output);

  }
}