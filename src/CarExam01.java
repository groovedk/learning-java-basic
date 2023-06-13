public class CarExam01 {

    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run();
        b1.안내방송();

        Car c1 = new Bus();
        c1.run();

        Bus c1_1 = (Bus) c1;
        c1_1.안내방송();

        Car c2 = new Car();
        c2.run();

        Car c3 = new SuperCar();
        c3.run();


    }

}
