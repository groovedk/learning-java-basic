import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExam12 {

    public static void main(String[] args) throws Exception {
        DataInputStream in = new DataInputStream(new FileInputStream("/tmp/score.dat"));

        extracted(in);

    }

    private static void extracted(DataInputStream in) throws IOException {
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total = in.readDouble();
        double avg = in.readDouble();

        in.close();

        System.out.println("name = " + name);
        System.out.println("kor = " + kor);
        System.out.println("eng = " + eng);
        System.out.println("math = " + math);
        System.out.println("total = " + total);
        System.out.println("avg = " + avg);
    }
}
