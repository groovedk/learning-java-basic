public class UnlimitedArgumentExam {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(5, 10));
        System.out.println(sum(5, 10, 15, 20));
        System.out.println(sum(5, 10, 15, 20, 25));
    }

    public static int sum(int... args) {
        System.out.println("args.length = " + args.length);
        int sum = 0;

        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
