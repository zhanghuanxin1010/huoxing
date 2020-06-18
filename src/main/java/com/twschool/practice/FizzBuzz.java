package com.twschool.practice;

public class FizzBuzz{

    public String say(int number)
    {
        if(number==1)
            return "1";
        else if(number%3==0)
           return "Fizz";
        return "0";

    }

}
