package com.example.myproject;

import com.example.fw.Controller;

public class FirstController extends Controller {

    @Override
    protected void run() {
        System.out.println("별도 동작 코드(각각 동작)");
    }

//    @Override
//    protected void init() {
//        super.init();
//        System.out.println("내 마음대로 오버라이딩");
//    }

}
