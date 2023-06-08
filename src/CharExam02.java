public class CharExam02 {

    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println("c1 = " + c1);
        System.out.println("(int)c1 = " + (int) c1);

        char c2 = (char) 97;
        System.out.println(c2);

        while (c1 <= 'z') {
            if (c1 % 5 == 0) {
                System.out.println(c1);
            } else {
                System.out.print(c1);
            }

            c1++;
        }
    }

}
