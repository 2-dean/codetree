import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            arr[i][0] = x1;
            arr[i][1] = x2;
        }
        
        int minLength = 100;
        
        for (int i = 0 ; i < n ; i++) {
            int minX = 100;
            int maxX = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                minX = Math.min(minX, arr[j][0]);
                maxX = Math.max(maxX, arr[j][1]);
            }

            minLength = Math.min(minLength, maxX - minX);
            
        }

        System.out.print (minLength);
    }
}