import java.util.Scanner;

public class Main {
    static int[] ability;
    public static int getDiff(int i, int j, int k) {
        int sum1 = ability[i] +  ability[j] +  ability[k];
        int sum2 = 0;
        for (int l = 0 ; l < 6; l++) {
            sum2 += ability[l];
        }
        sum2 -= sum1;
        return Math.abs(sum2 - sum1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ability = new int[6];
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = j + 1; k < 6; k++){
                    minDiff = Math.min(minDiff, getDiff(i, j, k));
                }
            }
        }
        // Please write your code here.
        System.out.print(minDiff);
    }
}