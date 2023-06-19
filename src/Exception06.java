public class Exception06 {
    public static void main(String[] args) {
        int[] array = {4, 2};
//        int[] value = null;
        int[] value = new int[1];


        try {
            value[0] = array[0] / array[1];
        } catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("aiob = " + aiob);
        } catch (ArithmeticException ae){
            System.out.println("ae = " + ae);
        } catch (Exception ex){
            System.out.println("ex = " + ex);
        }

        System.out.println(value.toString());
    }
}
