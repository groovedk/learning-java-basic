import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1, 4};

        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + "\t");
        }

        System.out.println("-----------------");


        int i = Arrays.binarySearch(array, 4);
        System.out.println(i);
    }
}
