public class Car {

    private String name;

    public Car() {
        System.out.println("자동차를 한대 생성합니다.");
    }

    public Car(String name) {
        System.out.println("자동차를 한대 생성합니다.");
        this.name = name;
    }

    public void printName() {
        System.out.println("car name = " + name);
    }

    public void run() {
        System.out.println("전륜구동으로 달린다");
    }

    @Override
    public String toString() {
//        return super.toString();
        return "자동 ";
    }

}
