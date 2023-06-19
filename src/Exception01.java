public class  Exception01 {
    public static void main(String[] args) {
        ExceptionObj01 exObj01 = new ExceptionObj01();
        try{
            int value = exObj01.divide(10, 0);
            System.out.println(value);
        } catch(ArithmeticException ex){
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}

