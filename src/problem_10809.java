import java.util.Scanner;

public class problem_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        sc.close();

        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            if(alphabet < 'z')
                System.out.print(str.indexOf(alphabet) + " ");
            else
                System.out.print(str.indexOf(alphabet));
        }
    }
}