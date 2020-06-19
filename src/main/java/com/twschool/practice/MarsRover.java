package com.twschool.practice;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {

        this.marsRoverPosition = marsRoverPosition;
    }

    public void execute(String commands) {
       // String direction = marsRoverPosition.getDirection();

        if (commands.equals("L"))
        {
            turnleft();
        }
        if (commands=="R")
        {
            turnright();
        }
        if (commands=="M")
        {
            move();
        }





       /*   if (direction=="N")
        {
            if (commands=="M")
            marsRoverPosition.setCoordinationY(marsRoverPosition.getMarsRoverPositionY()+1);
            if (commands=="L")
                marsRoverPosition.setDirection("w");
            if (commands=="R")
                marsRoverPosition.setDirection("E");
        }
        if (direction=="E")
        {
            if (commands=="M")
                marsRoverPosition.setMarsRoverPositionX(marsRoverPosition.getMarsRoverPositionX()+1);
            if (commands=="L")
                marsRoverPosition.setDirection("N");
            if (commands=="R")
                marsRoverPosition.setDirection("S");
        }
        if (direction=="S")
        {
            if (commands=="M")
                marsRoverPosition.setCoordinationY(marsRoverPosition.getMarsRoverPositionY()-1);
            if (commands=="L")
                marsRoverPosition.setDirection("E");
            if (commands=="R")
                marsRoverPosition.setDirection("W");
        }

        if (direction=="W")
        {
            if (commands=="M")
                marsRoverPosition.setMarsRoverPositionX(marsRoverPosition.getMarsRoverPositionX()-1);
            if (commands=="L")
                marsRoverPosition.setDirection("S");
            if (commands=="R")
                marsRoverPosition.setDirection("N");
        }
*/
    }




    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public void setMarsRoverPosition(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }


    private void move() {
       Direction direction=marsRoverPosition.getDirection();
      switch (direction)
      {
          case E:
              marsRoverPosition.setMarsRoverPositionX(marsRoverPosition.getMarsRoverPositionX()+1);
              break;
          case N:
              marsRoverPosition.setCoordinationY(marsRoverPosition.getMarsRoverPositionY()+1);
              break;
          case S:
              marsRoverPosition.setCoordinationY(marsRoverPosition.getMarsRoverPositionY()-1);
              break;
          case W:
              marsRoverPosition.setMarsRoverPositionX(marsRoverPosition.getMarsRoverPositionX()-1);
              break;
      }

    }
    private void turnleft() {
        Direction directionl=marsRoverPosition.getDirection().leftdirection();
        marsRoverPosition.setDirection(directionl);
    }
    private void turnright() {
        Direction directionr=marsRoverPosition.getDirection().rightdirection();
        marsRoverPosition.setDirection(directionr);
    }

}
