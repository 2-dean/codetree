import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] line = new int [201];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + 100;
            x2[i] = sc.nextInt() + 100;

            for (int j = x1[i]; j < x2[i]; j++) {
                line[j]++;
            } 
        
        }
        // Please write your code here.
        // 겹치는 구간~  뒤는 -1 해줌
        int max = 0;
        for (int i = 0; i< line.length; i++) {
            max = Math.max(max, line[i]);
        }
        System.out.print(max);
    }
}