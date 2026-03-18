import java.util.Scanner;
public class Main {
    public static int [] x;
    public static int [] y;
    public static int n;

    static int maxX = Integer.MIN_VALUE;
    static int minX = Integer.MAX_VALUE;
    static int maxY = Integer.MIN_VALUE;
    static int minY = Integer.MAX_VALUE;
    
    public static void getMaxTri (int i1, int i2, int i3) {    
        for (int i = 0; i < n; i++) {
            if (i == i1 || i == i2 || i == i3)
                continue;
            int cx = x[i], cy = y[i];
            
            maxX = Math.max(maxX, cx);
            maxY = Math.max(maxY, cy);

            minX = Math.min(minX, cx);
            minY = Math.min(minY, cy);
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        x = new int[n];
        y = new int[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.


        
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n ; j++) {
                for(int k = j + 1; k < n; k++) {
                    getMaxTri(i, j, k);
                }
            }
        }
        int ans = Math.abs(maxX - minX) * Math.abs(maxY - minY);
        System.out.print(ans);
    }
}