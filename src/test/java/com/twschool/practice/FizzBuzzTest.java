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
        Assert.assertEquals("Buzz", result);
    }
    @Test
    public void should_return_Whizz_when_given_7() {
        FizzBuzz fizzBuzz =new FizzBuzz();
        //given
        int number =7;
        //when
        String result=fizzBuzz.say(number);

        //then
        Assert.assertEquals("Whizz", result);
    }
   //3,5
    @Test
    public void should_return_FizzBuzz_when_can_be_divide_3_5() {
        FizzBuzz fizzBuzz =new FizzBuzz();
        //given
        int number =15;
        //when
        String result=fizzBuzz.say(number);

        //then
        Assert.assertEquals("FizzBuzz", result);
    }
}
