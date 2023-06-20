import java.io.FileReader;
import java.io.Reader;

public class HelloIO04 {

    public static void main(String[] args) throws Exception {
        Reader in = new FileReader("/tmp/hello.txt");

//        int ch1 = in.read();
//        System.out.println("ch1 = " + ch1);
//        System.out.println("(char)ch1 = " + (char) ch1);
//        int ch2 = in.read();
//        System.out.println("(char)ch2 = " + (char) ch2);
//        int ch3 = in.read();
//        System.out.println("(char)ch3 = " + (char) ch3);
//        int ch4 = in.read();
//        System.out.println("ch4 = " + ch4);
//        System.out.println("(char)ch4 = " + (char) ch4);

        int ch = -1;
        while ((ch = in.read()) != -1) {
            System.out.println((char) ch);
        }
        
        in.close();
    }
}
