package org.katas.refactoring.fizzbuzz.speculative.generality;

import org.katas.refactoring.fizzbuzz.speculative.generality.specification.*;

public class FizzBuzz {




  public String sayIt(int input) {

    MatchCriteria dividedBy3 = new DividedByThreeSpecification();
    MatchCriteria dividedBy5 = new DividedByFiveSpecification();
    MatchCriteria dividedBy7 = new DividedBySevenSpecification();

    MatchCriteria contain3 = new ContainThreeSpecification();
    MatchCriteria contain5 = new ContainFiveSpecification();

    if(contain5.and(dividedBy5).isSatisfiedBy(input)){
        return "BuzzBuzz";
    }
    if(contain5.and(dividedBy5.not()).isSatisfiedBy(input)){
        return "Buzz";
    }
    if (contain3.isSatisfiedBy(input)) {
      return "Fizz";
    }
    if (dividedBy3.and(dividedBy5).and(dividedBy7).isSatisfiedBy(input)) {
      return "FizzBuzzWhizz";
    }
    if (dividedBy3.and(dividedBy5).isSatisfiedBy(input)) {
      return "FizzBuzz";
    }
    if (dividedBy5.and(dividedBy7).isSatisfiedBy(input)) {
      return "BuzzWhizz";
    }
    if (dividedBy3.and(dividedBy7).isSatisfiedBy(input)) {
      return "FizzWhizz";
    }
    if (dividedBy3.isSatisfiedBy(input)) {
      return "Fizz";
    }
    if (dividedBy5.isSatisfiedBy(input)) {
      return "Buzz";
    }if (dividedBy7.isSatisfiedBy(input)) {
      return "Whizz";
    }
    return String.valueOf(input);
  }


  public String sayItOrigin(int input) {
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
