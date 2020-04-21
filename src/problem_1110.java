import java.util.Scanner;

public class problem_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.close();

        int num1 = 0;   //첫째 자리
        int num2 = 0;   //둘째 자리

        int tempNum = 0;
        int count = 0;

        num1 = num / 10;
        num2 = num % 10;

        while(true) {
            count++;

            tempNum = num2;

            num2 = (num1 + num2) % 10;
            num1 = tempNum;

            if(num == num1 * 10 + num2) {
                break;
            }
        }

        System.out.println(count);

    }
}
