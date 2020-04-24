import java.util.Scanner;

public class problem_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sc.close();

        int[] array = new int[10];

        String multiple = String.valueOf(num1 * num2 * num3);

        for(int i = 0; i < multiple.length(); i++) {
            array[multiple.charAt(i) - '0']++;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
