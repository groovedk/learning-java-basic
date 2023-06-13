public class BookExam01 {

    public static void main(String[] args) {
        Book b1 = new Book();
//        b1.price = 100;
//        System.out.println("b1.price = " + b1.price);

        b1.setPrice(1000);
        System.out.println(b1.getPrice());

        b1.setTitle("타이틀 프로퍼티");
        System.out.println(b1.getTitle());
    }

}
