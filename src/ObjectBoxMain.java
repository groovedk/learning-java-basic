public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.set("Kim");
        String str = (String) box.get();
        System.out.println("str = " + str);
        System.out.println("str = " + str.toUpperCase());

        box.set(new Integer(5));
        Integer i = (Integer) box.get();
        System.out.println(i);
        System.out.println(i.intValue());
        System.out.println(i.toString());


    }
}
