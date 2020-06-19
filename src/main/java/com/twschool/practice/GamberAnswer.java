package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GamberAnswer {


    private final List<String> GameAnswer;
    

    public GamberAnswer(String GamberAnswer) {
     this.GameAnswer= Arrays.asList(GamberAnswer.split(" "));
    }

    public String check(String userNumber)
    {
        List<String> userAnswerNumber=Arrays.asList(userNumber.split(" "));
        int valueAndPositionCorrect = 0;
        for(int index=0;index<userAnswerNumber.size();index++)
        {

            if(userAnswerNumber.get(index).equals(GameAnswer.get(index))) {
                valueAndPositionCorrect++;
            }


        }
        return   valueAndPositionCorrect + "A0B" ;
    }
}




