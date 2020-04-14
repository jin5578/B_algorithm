import java.util.Scanner;

public class problem_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        String str;

        if (a > 0) {
            if (b > 0) {
                str = "1";
            } else {
                str = "4";
            }
        } else {
            if (b > 0) {
                str = "2";
            } else {
                str = "3";
            }
        }

        System.out.println(str);
    }
}
