public class Bus2 extends Car2 {

    public Bus2() {
        super("BUS!!!");
        System.out.println("bus2 기본생성자 ");
    }

    @Override
    public void run() {
        System.out.println("bus run!");
    }
}
