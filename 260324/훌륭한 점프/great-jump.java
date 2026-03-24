import java.util.Scanner;
public class Main {
    static int n;
    static int k;
    static int[] arr;
    
    public static boolean isPossible(int maxVal) {
        int[] availableIndices = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= maxVal){
                availableIndices[cnt++] = i;
            }
        }

        for (int i = 1; i < cnt; i++){
            int dist = availableIndices[i] - availableIndices[i-1];
            if (dist > k) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int minmax = 0;
        
        //최댓값이 최소가 되도록 >
        for (int a = 1; a <= 100; a++) {
            if (a < arr[0] || a < arr[n-1]) continue;
            if (isPossible(a)) {
                System.out.print(a);
                return;
            }
        }
        System.out.print(minmax);
    }
}