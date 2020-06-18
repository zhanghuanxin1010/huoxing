package com.twschool.practice;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {

        this.marsRoverPosition = marsRoverPosition;
    }

    public void execute(String commands) {
        String direction = marsRoverPosition.getDirection();
          if (direction=="N")
        {
            if (commands=="M")
            marsRoverPosition.setCoordinationY(marsRoverPosition.getMarsRoverPositionY()+1);
            if (commands=="L")
                marsRoverPosition.setDirection("w");
        }

    }

    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public void setMarsRoverPosition(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }



}
