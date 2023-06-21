import java.io.ByteArrayOutputStream;

public class IOExam13 {

    public static void main(String[] args) throws Exception {
        int data1 = 1;
        int data2 = 2;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(data1);
        out.write(data2);
        out.close();

        byte[] ba = out.toByteArray();
        System.out.println(ba.length);
        System.out.println(" ===================== ");
        System.out.println(ba[0]);
        System.out.println(ba[1]);
    }

}
