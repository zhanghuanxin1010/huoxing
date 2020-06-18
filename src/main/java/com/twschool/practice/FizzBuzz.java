package com.twschool.practice;

public class FizzBuzz{

    public String say(int number)
    {
        if(number==1)
            return "1";
        else if(number%3==0)
           return "Fizz";
        else if(number%5==0)
            return "Whizz";
        return "0";

    }

}
