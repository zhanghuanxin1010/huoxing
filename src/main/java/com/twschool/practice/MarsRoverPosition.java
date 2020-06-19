package com.twschool.practice;

public class MarsRoverPosition {
    private int coordinationX;
    private int coordinationY;
    private Direction direction;

    public MarsRoverPosition(int coordinationX, int coordinationY, String direction) {
     this.coordinationX =coordinationX;
     this.coordinationY = coordinationY;
     this.direction=Direction.valueOf(direction);
    }

    public int getMarsRoverPositionX() {
        return coordinationX;
    }
    public int  getMarsRoverPositionY() {
        return coordinationY;
    }
    public Direction getDirection() {
        return direction;
    }


    public void setMarsRoverPositionX(int coordinationX) {
      this.coordinationX =coordinationX;
    }
    public void setCoordinationY(int coordinationY) {
        this.coordinationY = coordinationY;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
