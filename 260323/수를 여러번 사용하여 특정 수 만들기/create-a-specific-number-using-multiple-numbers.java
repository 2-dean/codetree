import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int maxVal = 0;

        // a를 i번 더함
        for (int i = 0; i * A <= C; i++){
            for (int j = 0; (i * A ) + (j * B) <= C; j++) {
                int currentSum = (i * A ) + (j * B);

                maxVal = Math.max(currentSum, maxVal);
            }
        }

        System.out.print(maxVal);
    }
}