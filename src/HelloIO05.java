import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HelloIO05 {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(
            new OutputStreamWriter(new FileOutputStream("/tmp/my.txt")));

        out.println("hello");
        out.println("world");
        out.println("!!!!");
        out.close();

    }

}
