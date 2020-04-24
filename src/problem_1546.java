import java.io.IOException;
import java.util.Scanner;

public class problem_1546 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int total = 0;
        int max = 0;

        int score;

        for(int i = 0; i < count; i++) {
            score = sc.nextInt();

            total += score;

            if(score > max) {
                max = score;
            }
        }

        sc.close();

        Double avg = 100.0 * total / max / count;
        System.out.printf("%.2f", avg);
    }
}
