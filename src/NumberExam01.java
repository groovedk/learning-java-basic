public class NumberExam01 {

    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println("maxInt = " + maxInt);
        System.out.println("minInt = " + minInt);
        System.out.println("maxDouble = " + maxDouble);
        System.out.println("minDouble = " + minDouble);

        double d1 = 50;
        double d2 = 500L;

//        int i1 = 50.0;

        int i1 = (int) 50.0;
        int i2 = (int) 25.6F;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

    }

}
