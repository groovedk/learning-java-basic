public abstract class Car2 {

    public Car2(String name) {
        super();
        System.out.println("car2 기본생성자 ");
    }

    //추상메소드, 선언만 되어있고 구현이 없음, 꼭 가지고 있어야 하는 메서드이지만 상속받는 애들이 다 다르게 구현해야할거같음

    public abstract void run();
}
