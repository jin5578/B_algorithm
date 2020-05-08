import java.util.Scanner;

public class problem_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String tempA = "", tempB = "";

        for(int i = 2; i >= 0; i--) {
            tempA += a.charAt(i);
            tempB += b.charAt(i);
        }

        if (Integer.parseInt(tempA) > Integer.parseInt(tempB))
            System.out.println(tempA);
        else
            System.out.println(tempB);
    }
}
