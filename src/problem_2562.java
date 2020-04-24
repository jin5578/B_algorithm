import java.util.Scanner;

public class problem_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];

        int maxNum = 0;
        int maxOrder = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        for(int i = 0; i < array.length; i++) {
            if(maxNum < array[i]) {
                maxNum = array[i];
                maxOrder = i + 1;
            }
        }

        System.out.println(maxNum + "\n" + maxOrder);
    }
}
