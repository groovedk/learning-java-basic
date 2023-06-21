import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class IOExam11 {

    public static void main(String[] args) throws Exception {
        String name = "Kim";
        int kor = 90;
        int eng = 50;
        int math = 71;

        double total = kor + eng + math;
        double avg = total / 3.0;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("/tmp/score.dat"));
        out.writeUTF(name);

        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);

        out.writeDouble(total);
        out.writeDouble(avg);

        out.close();
    }

}
