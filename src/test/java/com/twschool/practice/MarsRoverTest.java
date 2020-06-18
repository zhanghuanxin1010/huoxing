package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void should_return_position_x0_y0_N_when_given_init()
    {
        //given

        MarsRoverPosition initcordirection=new MarsRoverPosition(0,0,"N");
        MarsRover marsRover=new MarsRover(initcordirection);
        //when
       // Cordirection retult=MarsRover.execute();
        MarsRoverPosition marsRoverPosition =marsRover.getMarsRoverPosition();

        //then
        Assert.assertNotNull(marsRoverPosition);

    }
    @Test
    public void should_return_position_x0_y1_N_when_given_M()
    {
        //given

        MarsRoverPosition initcordirection=new MarsRoverPosition(0,0,"N");
        MarsRover marsRover=new MarsRover(initcordirection);
        String commands="M";
        //when
         //Cordirection retult=
        marsRover.execute(commands);

        //then
        MarsRoverPosition marsRoverPosition = marsRover.getMarsRoverPosition();
        Assert.assertEquals(0, marsRoverPosition.getMarsRoverPositionX());
        Assert.assertEquals(1, marsRoverPosition.getMarsRoverPositionY());
        Assert.assertEquals("N", marsRoverPosition.getDirection());

    }
}
