import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HelloIO06 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(new FileInputStream("/tmp/my.txt")));

//        String s1 = in.readLine();
//        String s2 = in.readLine();
//        String s3 = in.readLine();
//        String s4 = in.readLine();
//
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);
//        System.out.println("s3 = " + s3);
//        System.out.println("s4 = " + s4);

        String line = null;
        while ((line = in.readLine()) != null) {
            System.out.println("line = " + line);
        }

        in.close();

    }

}
