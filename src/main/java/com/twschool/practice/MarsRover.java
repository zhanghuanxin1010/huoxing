package com.twschool.practice;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {

        this.marsRoverPosition = marsRoverPosition;
    }

    public void execute(String commands) {

        if (commands=="M")
        {
            String direction = marsRoverPosition.getDirection();
            if (direction=="N")
            marsRoverPosition.setCoordinationY(marsRoverPosition.getMarsRoverPositionY()+1);
        }

    }

    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public void setMarsRoverPosition(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }



}
