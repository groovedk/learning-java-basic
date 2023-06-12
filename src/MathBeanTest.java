public class MathBeanTest {

    public static void main(String[] args) {
        MathBean mathBean = new MathBean();
        mathBean.printClassName();
        mathBean.printNumber(100);

        int one = mathBean.getOne();
        System.out.println(one);

        int plus = mathBean.plus(11, 22);
        System.out.println("plus = " + plus);
    }

}
