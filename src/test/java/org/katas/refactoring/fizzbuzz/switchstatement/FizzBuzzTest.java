package org.katas.refactoring.fizzbuzz.switchstatement;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_normal_number_when_number_is_normal() {
        int input = 1;
        String expect = "1";
        String actual = new FizzBuzz().sayIt(input);


        assertThat(actual, Is.is(expect));
    }

    @Test
    public void should_return_fizz_when_number_can_be_divided_by_3() {
        int input = 3;
        String expect = "Fizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_buzz_when_number_can_be_divided_by_5_and_not_contain_5() {
        int input = 5;
        String expect = "Buzz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_FizzBuzz_when_number_can_be_divided_by_3_and_5() {
        int input = 15;
        String expect = "FizzBuzz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_Whizz_when_number_can_be_divided_by_7() {
        int input = 7;
        String expect = "Whizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_FizzWhizz_when_number_can_be_divided_by_3_and_7() {
        int input = 21;
        String expect = "FizzWhizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }

    @Test
    public void should_return_BuzzWhizz_when_number_can_be_divided_by_5_and_7() {
        int input = 70;
        String expect = "BuzzWhizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }



    @Test
    public void should_return_FizzBuzzWhizz_when_number_can_be_divided_by_3_and_5_and_7() {
        int input = 105;
        String expect = "FizzBuzzWhizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_Fizz_when_number_contain_3() {
        int input = 63;
        String expect = "Fizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_Fizz_when_number_contain_3_and_can_be_divided_by_any_other_number() {
        int input = 35;
        String expect = "Fizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


}
