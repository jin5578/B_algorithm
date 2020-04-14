import java.util.Scanner;

public class problem_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int tempNum = num2;

        sc.close();

        while(tempNum > 0) {
            System.out.println(num1 * (tempNum % 10));

            tempNum /= 10;
        }

        System.out.println(num1 * num2);
    }
}
