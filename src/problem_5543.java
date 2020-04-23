import java.util.Scanner;

public class problem_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int burgerLow = sc.nextInt();
        int burgerTemp = 0;

        for(int i = 0; i < 2; i++) {
            burgerTemp = sc.nextInt();

            burgerLow = burgerLow < burgerTemp ? burgerLow : burgerTemp;
        }

        int beverageLow = sc.nextInt();
        int beverageTemp = sc.nextInt();

        sc.close();

        beverageLow = beverageLow < beverageTemp ? beverageLow : beverageTemp;

        System.out.println(burgerLow + beverageLow - 50);
    }
}
