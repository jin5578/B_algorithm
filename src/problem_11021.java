import java.util.Scanner;

public class problem_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i = 1; i < count+1; i++) {
            System.out.println("Case #"+i+": "+(sc.nextInt() + sc.nextInt()));
        }
    }
}
