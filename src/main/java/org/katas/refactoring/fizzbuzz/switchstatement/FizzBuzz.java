package org.katas.refactoring.fizzbuzz.switchstatement;


public class FizzBuzz {


    public String sayIt(int input) {

        String result = "";
        String inputString = String.valueOf(input);
        if (inputString.contains("3")) {
            return "Fizz";
        }
        byte flag = 0;
        flag += input % 3 == 0 ? 0b1 : 0;
        flag += input % 5 == 0 ? 0b10 : 0;
        flag += input % 7 == 0 ? 0b100 : 0;

        switch (flag) {
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


    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 200; i++) {
            System.out.println(fizzBuzz.sayIt(i+1));
        }
    }
}
