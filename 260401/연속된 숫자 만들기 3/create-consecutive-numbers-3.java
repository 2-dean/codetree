import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int[] line = new int [c+1];


        int max = 0;

        int leftDiff = b-a-1;
        int rightDiff = c-b-1;

        max = Math.max(leftDiff,RightDiff);
        System.out.print(max);

    }
}