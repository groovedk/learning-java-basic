public class VendingMachineMain {

    public static void main(String[] args) {
        VendingMachine.printVersion();

        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();
//
//        String product = vm1.pushProductButton(100);
//        System.out.println("product = " + product);

        String s = vm1.pushProductButton(100);
        System.out.println("s = " + s);
        String s1 = vm2.pushProductButton(200);
        System.out.println("s1 = " + s1);
//        vm1.printVersion();
    }


}
