package com.twschool.practice;

public class GuessNumberGame {


    private final GamberAnswer gamberAnswer;
    private GameStatus gameStatus;

    public GuessNumberGame(GamberAnswer answer) {
    this.gamberAnswer=answer;

    }

    public void  guess(String userString) {
   String  result= gamberAnswer.check(userString);
     if("4A0B".equals(result))
     {
         gameStatus=GameStatus.Succeed;
     }

    }

    public GameStatus getStatus() {
        return gameStatus;

    }
}
