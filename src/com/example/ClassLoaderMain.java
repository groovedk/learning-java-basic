package com.example;

import java.lang.reflect.Method;

public class ClassLoaderMain {

    public static void main(String[] args) throws Exception {
        Bus b1 = new Bus();
        b1.a();

        SuperCar s1 = new SuperCar();
        s1.a();

        //클래스는 클래스 패스에서 찾음. 클래스 명으로 찾을 수 있음.
//        String className = "com.example.Bus";
        String className = "com.example.SuperCar";
        Class clazz = Class.forName(className);

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m.getName());
        }

        System.out.println("-------------------");
        //Object o  = new Bus();
        Object o = clazz.newInstance();
//        Bus b1 = (Bus) o;
//        b1.a();
        SuperCar b2 = (SuperCar) o;
        b2.a();

//        SuperCar sb = (SuperCar) o;
//        sb.a();

        System.out.println("=================");

        // Car c  = new Bus();
        Car c1 = (Car) o;
        c1.a();

        //reflect
//        Method m = clazz.getDeclaredMethod('a', null);
//        m.invoke('a', null)

    }

}
