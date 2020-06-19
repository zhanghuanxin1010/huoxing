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
    public void should_return_4A0B_when_given_1234_answer_1234()
    {
        //given
        GamberAnswer answer=new GamberAnswer("1 2 3 4");
        //when
        String result =answer.check("1 2 3 4");
        //then
        Assert.assertEquals("4A0B",result);

    }
    //数字部分对，位置部分对
    @Test
    public void should_return_0A4B_when_given_4321_answer_1234()
    {
        //given
        GamberAnswer answer=new GamberAnswer("1 2 3 4");
        //when
        String result =answer.check("4 3 2 1");
        //then
        Assert.assertEquals("0A4B",result);
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
