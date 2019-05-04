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
    public void should_return_fizz_when_number_is_3_times() {
        int input = 3;
        String expect = "Fizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_buzz_when_number_can_be_devided_by_5_and_not_contain_5() {
        int input = 10;
        String expect = "Buzz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_fizzbuzz_when_number_can_be_divided_by_3_and_5() {
        int input = 60;
        String expect = "FizzBuzz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_fizzbuzz_when_number_can_be_divided_by_7() {
        int input = 7;
        String expect = "Whizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_fizzbuzz_when_number_can_be_divided_by_3_and_7() {
        int input = 21;
        String expect = "FizzWhizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }

    @Test
    public void should_return_fizzbuzz_when_number_can_be_divided_by_5_and_7() {
        int input = 70;
        String expect = "BuzzWhizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }



    @Test
    public void should_return_fizzbuzz_when_number_can_be_divided_by_3_and_5_and_7() {
        int input = 210;
        String expect = "FizzBuzzWhizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_fizzbuzz_when_number_contain_3() {
        int input = 63;
        String expect = "Fizz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }

    @Test
    public void should_return_buzz_when_number_contain_5_and_cannot_be_devided_by_5() {
        int input = 52;
        String expect = "Buzz";
        String actual = new FizzBuzz().sayIt(input);

        assertThat(actual, Is.is(expect));
    }


    @Test
    public void should_return_buzzbuzz_when_number_contain_5_and_can_be_devided_by_5() {

        assertThat(new FizzBuzz().sayIt(5), Is.is("BuzzBuzz"));
    }

    @Test
    public void should_return_buzzbuzz_when_number_contain_5_over_the_other() {
        assertThat(new FizzBuzz().sayIt(51), Is.is("Buzz"));
        assertThat(new FizzBuzz().sayIt(15), Is.is("BuzzBuzz"));
        assertThat(new FizzBuzz().sayIt(35), Is.is("BuzzBuzz"));
        assertThat(new FizzBuzz().sayIt(105), Is.is("BuzzBuzz"));
    }

}
