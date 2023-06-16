public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> gb = new GenericBox<>();
        gb.add("Kim");
        String s = gb.get();
        System.out.println("s = " + s);

        GenericBox<Integer> gb2 = new GenericBox<>();
        gb2.add(11);
        Integer i = gb2.get();
        System.out.println("i = " + i);

        GenericBox<Object> gb3 = new GenericBox<>();
//        gb3.add("정동환 정동환 정동환 정동환 정동환 ");
        gb3.add(111);

        Object o1 = gb3.get();


        System.out.println(o1.getClass());


        String o2 = (String) gb3.get().toString();
        System.out.println(o2.getClass());


        System.out.println(o1);
        System.out.println(o2);

    }
}
