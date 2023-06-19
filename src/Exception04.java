import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception04 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("Exception04.java");
        } catch (FileNotFoundException ex){
            System.out.println("ex = " + ex);
        }
    }
}
