import java.util.Scanner;

public class problem_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sc.close();

        System.out.println((num1 + num2) % num3);
        System.out.println(((num1 % num3) + (num2 % num3)) % num3);
        System.out.println((num1 *  num2) % num3);
        System.out.println(((num1 % num3) * (num2 % num3)) % num3);
    }
}
