package com.twschool.practice;

public class FizzBuzz{

    public String say(int number)
    {
        if(number==1)
            return "1";
       if(number%3==0)
        {
            if (number%5==0)
                return "FizzBuzz";
            else
                return "Fizz";
        }

         if(number%5==0)
            return "Buzz";
         if(number%7==0)
            return "Whizz";
         if(number%15==0)
            return "FizzBuzz";
        return "0";

    }

}
