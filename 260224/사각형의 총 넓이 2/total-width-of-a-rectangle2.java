import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        int[][] map = new int [201][201];
        int count = 0;
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + 100;
            y1[i] = sc.nextInt() + 100;
            x2[i] = sc.nextInt() + 100;
            y2[i] = sc.nextInt() + 100;

            for (int j = x1[i]; j < x2[i]; j++) {
                for (int k = y1[i]; k < y2[i]; k++) {
                    map[j][k]++;
                }
            }
        }
        for(int i =0 ; i < map.length; i++) {
            for(int j = 0; j<map[i].length; j++) {
                if(map[i][j] > 0) count++;
            }
        }

        System.out.print(count);
        // Please write your code here.
    }
}