import java.util.Scanner;

public class problem_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int num1, num2;

        for(int i = 1; i < count+1; i++) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }
}
