import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.

        int minVal = INT_MAX;
        
        // 집을 순서대로 순회
        for (int i = 0; i < n ;i++) {
            int diffSum = 0;
            for (int j = 0; j < n; j++) {
                int diff = Math.abs(i - j); // 이동거리
                int people = a[j]; // 이동하는 사람 수
               // System.out.println ("diff : " + diff + ", people : " + people );
                diffSum += (diff * people);
            }
            //System.out.println("---------");
            minVal = Math.min(minVal, diffSum);
        }

        System.out.print(minVal);
    }
}