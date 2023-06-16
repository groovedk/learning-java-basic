public class EmptyCommandLineArgumentExam {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("none args ");
            System.exit(0);

            //

        } else {

            System.out.println(args);
            for (String arg : args) {
                System.out.println(arg);
            }

            System.out.println("args.length = " + args.length);

        }
    }
}
