import java.util.Scanner;
public class Main {
    public static int [] x;
    public static int [] y;
    public static int n;


     public static int area(int i, int j, int k) {
        return Math.abs((x[i] * y[j] + x[j] * y[k] + x[k] * y[i]) - 
                        (x[j] * y[i] + x[k] * y[j] + x[i] * y[k]));
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


        // 3개 점 선택
        int maxArea = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n ; j++) {
                for(int k = j + 1; k < n; k++) {
                    // x값이 같은 쌍이 있고, y값도 같은 쌍이 있는경우에만 최대넓이 계산 
                    if ((x[i] == x[j] || x[i] == x[k] || x[j] == x[k]) ||
                        (y[i] == y[j] || y[i] == y[k] || y[j] == y[k]) 
                    ) maxArea = Math.max(maxArea, area(i, j, k));
                }
            }
        }
        System.out.print();
    }
}