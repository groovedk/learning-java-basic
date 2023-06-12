public class Person {

    String name;
    String address;
    boolean isVip;

    //    static int count = 0;
    static int count;

    static {
        count = 100;
    }

    public void printName() {
        System.out.println("name = " + name);
    }

    public static void printCount() {
        System.out.println("count = " + count);
//        System.out.println("instance field name = " + name);
    }
}
