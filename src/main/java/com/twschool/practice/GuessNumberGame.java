package com.twschool.practice;

public class GuessNumberGame {

    private int   MAX_TIMES=6;
    private final GamberAnswer gamberAnswer;
    private GameStatus gameStatus;
    private int times=MAX_TIMES;

    public GuessNumberGame(GamberAnswer answer) {
    this.gamberAnswer=answer;

    }

    public void  guess(String userString) {
   String  result= gamberAnswer.check(userString);
        times--;
     if("4A0B".equals(result))
     {
         gameStatus=GameStatus.Succeed;
     }else if(times==0)
     {
         gameStatus=GameStatus.Failed;
     }
     else
     {
         gameStatus=GameStatus.Continue;
     }

    }

    public GameStatus getStatus() {
        return gameStatus;

    }
}
