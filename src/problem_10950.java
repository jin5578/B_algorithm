import java.util.Scanner;

public class problem_10950 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.println(sc.nextInt() + sc.nextInt());
        }

        sc.close();
    }

}
