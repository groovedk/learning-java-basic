package com.example;

public class LottoMachineMain {

    public static void main(String[] args) {
        Ball[] balls = new Ball[45];

        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i);
        }

        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i].getNumber() = " + result[i].getNumber());

        }
    }

}
