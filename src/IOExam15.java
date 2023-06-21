import java.io.StringReader;
import java.io.StringWriter;

public class IOExam15 {

    public static void main(String[] args) throws Exception {
        StringWriter out = new StringWriter();
        out.write("hello");
        out.write("world");
        out.write("!!!");
        out.close();

        String str = out.toString();
        System.out.println("str = " + str);

        System.out.println(" ================ ");

        StringReader in = new StringReader("서울시 은평구 연서로 3-3, 102");
        int ch = -1;

        while ((ch = in.read()) != -1) {
            System.out.println(ch);
            System.out.println((char) ch);
        }

        in.close();
    }

}
