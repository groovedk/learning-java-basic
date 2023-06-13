public class StandardOutput {

    public void println(boolean b) {
        System.out.println("b = " + b);
    }

    public void println(int i) {
        System.out.println("i = " + i);
    }

    public void println(double d) {
        System.out.println("d = " + d);
    }

    public void println(String s) {
        System.out.println("s = " + s);
    }

    public static void main(String[] args) {
        StandardOutput so = new StandardOutput();
        so.println(100);
        so.println("hello");
        so.println(10.5);
        so.println(true);
    }

}
