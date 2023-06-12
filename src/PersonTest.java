public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "홍길동";
        p2.name = "홍길동서";

        System.out.println("p1.name = " + p1.name);
        System.out.println("p1.name = " + p1.name.length());
        System.out.println("p1.address = " + p1.address);
        System.out.println("p1.isVip = " + p1.isVip);
        System.out.println("p1.count = " + p1.count);
        System.out.println("p1.count = " + Person.count);

        p1.count++;
        System.out.println("p1.count = " + p1.count);
        System.out.println("p2.count = " + p2.count);

        p2.count++;
        System.out.println("p1.count = " + p1.count);
        System.out.println("p2.count = " + p2.count);

        System.out.println(" ==================== ");

        System.out.println("p2.name = " + p2.name);
        System.out.println("p2.name = " + p2.name.length());
        System.out.println("p2.address = " + p2.address);
        System.out.println("p2.isVip = " + p2.isVip);

        System.out.println(" ==================== ");
        p1.printName();
        p1.printCount();
        Person.count++;
        Person.printCount();

    }

}
