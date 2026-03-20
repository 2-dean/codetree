import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 폭탄개수
        int k = sc.nextInt(); // 거리k 이내면 같은번호의 폭탄 폭발
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }
        
        int result = -1 ;
    
        for (int i = 0 ; i < n - k; i++) {
            for (int j = i + 1; j <= i + k; j++) {
                // 배열 범위를 벗어나면 중단
                if (j >= n) break;

                if (bombs[i] == bombs[j]) {
                    result = Math.max(result, bombs[i]);
                    break;
                }
            }
        }
    
        System.out.print(result);
    }
}