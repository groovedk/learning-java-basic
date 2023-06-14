public class CarExam02 {

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("c1 = " + c1);
        c1.printName();

        Object c2 = (Object) c1;
        System.out.println("c2 = " + c2);

        Object c3 = new Object();
        System.out.println("c3 = " + c3);

        System.out.println(" = ==================");
        Car c4 = new Car("groovedk");
        c4.printName();


    }

}
