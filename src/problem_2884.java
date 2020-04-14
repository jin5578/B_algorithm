import java.util.Scanner;

public class problem_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        sc.close();

        minute -= 45;

        if (minute < 0) {
            if (hour == 0) {
                hour = 23;
                minute += 60;
            } else {
                hour -= 1;
                minute += 60;
            }
        }

        System.out.println(hour + " " + minute);
    }
}
