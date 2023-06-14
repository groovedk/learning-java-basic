public class UserExam {

    public static void main(String[] args) {
        User u1 = new User("root@axisj.com", "root");
        System.out.println("u1.name = " + u1.getName());
        System.out.println("u1.email = " + u1.getEmail());
        System.out.println("u1.pwd = " + u1.getPassword());
        System.out.println(u1);

        System.out.println("==================== ");

        User u2 = new User("groovedk@gmail.com", "DK", "1234!");
        System.out.println("u2.name = " + u2.getName());
        System.out.println("u2.email = " + u2.getEmail());
        System.out.println("u2.pwd = " + u2.getPassword());
        System.out.println(u2);

    }

}
