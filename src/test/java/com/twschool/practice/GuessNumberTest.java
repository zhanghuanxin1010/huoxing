package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.stubbing.Answer;

public class GuessNumberTest {


    //数字全对，位置全对
    @Test
    public void should_return_4A_when_given_1234_answer_1234()
    {
     //given
       GamberAnswer answer=new GamberAnswer("1 2 3 4");
       //when
       String result =answer.check("1 2 3 4");
       //then
        Assert.assertEquals("4A",result);

    }

    //数字全对，位置部分对
    @Test
    public void should_return_1A3B_when_given_section_position_section_number()
    {

    }
    //数字部分对，位置部分对
    @Test
    public void should_return_1A1B_when_given_section_position_all_number()
    {

    }
    //数字全对，位置全不对
    @Test
    public void should_return_4B_when_given_not_position_all_number()
    {

    }
    //数字部分对，位置全不对
    @Test
    public void should_return_2B_when_given_not_position_section_number()
    {

    }
   //数字全部对，位置全不对
    @Test
    public void should_return_0A0B_when_given_not_position_not_number()
    {

    }
}
