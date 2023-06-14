package com.example;

public interface LottoMachine {

    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;

    public abstract void setBalls(Ball[] balls);

    public void mix();

    public Ball[] getBalls();

}
