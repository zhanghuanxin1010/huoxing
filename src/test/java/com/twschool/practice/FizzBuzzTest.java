package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_given_1() {
        FizzBuzz fizzBuzz =new FizzBuzz();
        //given
        int number =1;
      //when
        String result=fizzBuzz.say(number);

       //then

        Assert.assertEquals("1", result);
    }
    @Test
    public void should_return_Fizz_when_given_3() {
        FizzBuzz fizzBuzz =new FizzBuzz();
        //given
        int number =3;
        //when
        String result=fizzBuzz.say(number);

        //then
        Assert.assertEquals("Fizz", result);
    }
    @Test
    public void should_return_Whizz_when_given_5() {
        FizzBuzz fizzBuzz =new FizzBuzz();
        //given
        int number =5;
        //when
        String result=fizzBuzz.say(number);

        //then
        Assert.assertEquals("Whizz", result);
    }
}
