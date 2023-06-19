import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String line = null;

        br.readLine();

        while ( (line = br.readLine()) != null){
            System.out.println("line = " + line);
        }
        
    }
}
