package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.stubbing.Answer;

public class GuessNumberTest {




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
    @Test
    public void should_return_1A3B_when_given_1423_answer_1234()
    {
        //given
        GamberAnswer answer=new GamberAnswer("1 2 3 4");
        //when
        String result =answer.check("1 4 2 3");
        //then
        Assert.assertEquals("1A3B",result);
    }
    //数字部分对，位置全不对
    @Test
    public void should_return_1A1B_when_given_1563_answer_1234()
    {
        //given
        GamberAnswer answer=new GamberAnswer("1 2 3 4");
        //when
        String result =answer.check("1 5 6 3");
        //then
        Assert.assertEquals("1A1B",result);
    }
    @Test
    public void should_return_2B_when_given_2356_answer_1234()
    {
        //given
        GamberAnswer answer=new GamberAnswer("1 2 3 4");
        //when
        String result =answer.check("2 3 5 6");
        //then
        Assert.assertEquals("0A2B",result);
    }

}
