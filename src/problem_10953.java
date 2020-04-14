import java.util.Scanner;

public class problem_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            String[] str = sc.next().split(",");

            System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
        }
    }
}
