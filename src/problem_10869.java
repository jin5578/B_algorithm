import java.util.Scanner;

public class problem_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println((num1 + num2) + "\n" + (num1 - num2) + "\n" + (num1 * num2) + "\n" + (num1 / num2) + "\n" + (num1 % num2));

        sc.close();
    }
}
