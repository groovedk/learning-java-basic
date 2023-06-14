public class Car2Exam02 {

    public static void main(String[] args) {
//        Car2 c = new Car2("groovedk");
        Bus2 b = new Bus2();
        b.run();

        SportCar s1 = new SportCar("SC");
        s1.run();

        System.out.println(" =================== ");

        Car2[] car2s = new Car2[2];
        car2s[0] = new Bus2();
        car2s[1] = new SportCar("SC");
        for (Car2 car2 : car2s) {
            car2.run();
        }


    }

}
