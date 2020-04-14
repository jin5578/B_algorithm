import java.util.Scanner;

public class problem_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        String str;

        if(num1 > num2) {
            str = ">";
        } else if(num1 < num2) {
            str = "<";
        } else {
            str = "==";
        }

        System.out.println(str);
    }
}
