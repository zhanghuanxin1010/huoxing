package com.twschool.practice;

public class MarsRoverPosition {
    private int coordinationX;
    private int coordinationY;
    private String direction;

    public MarsRoverPosition(int coordinationX, int coordinationY, String direction) {
     this.coordinationX =coordinationX;
     this.coordinationY = coordinationY;
     this.direction=direction;
    }

    public int getMarsRoverPositionX() {
        return coordinationX;
    }
    public int  getMarsRoverPositionY() {
        return coordinationY;
    }
    public String getDirection() {
        return direction;
    }


    public void setMarsRoverPositionX(int coordinationX) {
      this.coordinationX =coordinationX;
    }
    public void setCoordinationY(int coordinationY) {
        this.coordinationY = coordinationY;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
