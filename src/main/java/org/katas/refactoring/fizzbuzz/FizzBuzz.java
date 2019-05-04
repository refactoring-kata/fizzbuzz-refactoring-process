package org.katas.refactoring.fizzbuzz;

public class FizzBuzz {
  public String sayIt(int input) {
    String result = "";
    String inputString = String.valueOf(input);
    if(inputString.contains("5")){
      if(input % 5 !=0) {
        return "Buzz";
      }else{
        return "BuzzBuzz";
      }
    }
    if (inputString.contains("3")) {
      return "Fizz";
    }
    if (input % 3 == 0) {
      result += "Fizz";
    }
    if (input % 5 == 0) {
      result += "Buzz";
    }
    if (input % 7 == 0) {
      result += "Whizz";
    }
    return result.equals("") ? inputString : result;
  }
}
