import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minCost = Integer.MAX_VALUE; // 100*100

        // 하나씩 높이를 다르게해봄
        for (int a = 0; a <= 83; a++) { // 높이 차가 17이니까 최저높이의 최대가 83까지 가능
            int cost = 0;
            for (int i = 0; i < n; i++) { 
                if (arr[i] < a ) {// 범위보다 낮은언덕 =>높히기
                    int diff = a - arr[i];
                    cost += diff * diff;
                } else if (arr[i] > a + 17) { // 범위보다 높은언덕 => 깎기
                    int diff = arr[i] - (a + 17);
                    cost += diff * diff; 
                } else { // 범위이내
                    continue;
                }
            }
            minCost = Math.min(minCost, cost);
        }

        System.out.print(minCost);
    }
}