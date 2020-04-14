import java.util.Scanner;

public class problem_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sc.close();

        String str;

        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
            str = "1";
        } else {
            str = "0";
        }

        System.out.println(str);
    }
}
