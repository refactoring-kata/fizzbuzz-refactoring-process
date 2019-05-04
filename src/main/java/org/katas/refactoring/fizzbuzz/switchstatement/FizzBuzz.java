package org.katas.refactoring.fizzbuzz.switchstatement;

import org.katas.refactoring.fizzbuzz.speculative.generality.specification.*;

public class FizzBuzz {


  public String sayIt(int input) {

    String result = "";
    String inputString = String.valueOf(input);
    if (inputString.contains("5")) {
      if (input % 5 != 0) {
        return "Buzz";
      } else {
        return "BuzzBuzz";
      }
    }
    if (inputString.contains("3")) {
      return "Fizz";
    }
    byte flag = 0;
    flag += input % 3 == 0 ? 0b1 : 0;
    flag += input % 5 == 0 ? 0b10: 0;
    flag += input % 7 == 0 ? 0b100 : 0;

    switch(flag){
      case 1:
        return "Fizz";
      case 2:
        return "Buzz";
      case 3:
        return "FizzBuzz";
      case 4:
        return "Whizz";
      case 5:
        return "FizzWhizz";
      case 6:
        return "BuzzWhizz";
      case 7:
        return "FizzBuzzWhizz";
    }
    return String.valueOf(input);
  }


  public String sayItOrigin(int input) {
    String result = "";
    String inputString = String.valueOf(input);
    if (inputString.contains("5")) {
      if (input % 5 != 0) {
        return "Buzz";
      } else {
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
