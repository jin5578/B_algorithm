import java.util.Scanner;

public class problem_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        sc.close();

        String str;

        if (num1 >= 90) {
            str = "A";
        } else if (num1 >= 80) {
            str = "B";
        } else if (num1 >= 70) {
            str = "C";
        } else if (num1 >= 60) {
            str = "D";
        } else {
            str = "F";
        }

        System.out.println(str);
    }
}
