import java.util.Arrays;
import java.util.Scanner;

public class problem_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(array);

        System.out.println(array[0]+ " " + array[size-1]);
    }
}
