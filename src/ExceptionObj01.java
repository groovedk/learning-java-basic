public class ExceptionObj01 {
    /**
     * i 를 k 로 나눈 나머지를 반환한다.
     *
     * @param i
     * @param k
     * @return
     * @throws ArithmeticException
     */
    public int divide(int i, int k) throws ArithmeticException {
        int value = 0;

        value = i / k;

//        try{
//        } catch(ArithmeticException ex){
//            System.out.println("0으로 나눌 수 없습니다.");
//            System.out.println(ex.toString());
//        }
        return value;
    }

}
