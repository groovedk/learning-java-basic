package com.example.fw;

/*
 * 초기화 - 같은코드
 * 실행
 * 마무리 - 같은코드
 * */
public abstract class Controller {

    //같은 패키지거나 상속받은 경우 사용
    protected final void init() {
        System.out.println("초기화 코드 ");
    }

    protected final void close() {
        System.out.println("마무리 코드 ");
    }

    protected abstract void run();

    //template method sample
    public void execute() {
        this.init();
        this.run();
        this.close();
    }
}
