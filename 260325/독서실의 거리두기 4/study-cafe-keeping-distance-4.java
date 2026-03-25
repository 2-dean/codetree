import java.util.Scanner;

public class Main {
    static char[] seat;
    static int n;

    public static int getMaxDist() {
        int minDist = n; // 초기값을 최대로
        
        for (int i = 0 ; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (seat[i] == '1' && seat[j]== '1') {
                    minDist = Math.min(minDist, j - i); 
                }
            }
        }
        return minDist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        seat = sc.next().toCharArray();
        
        // Please write your code here.

        int ans = 0;

        //첫전째사람 앉기
        for (int i = 0; i < n; i++) { //
            // 두번째 사람 앉을 자리
            for (int j = i + 1; j < n; j++) {
                // 둘다 빈자리에 만 앉음
                if (seat[i] == '0' && seat[j] == '0') {
                  
                    seat[i] = '1';
                    seat[j] = '1';

                    // 거리구함
                    ans = Math.max(ans, getMaxDist());
                    
                    seat[i] = '0';
                    seat[j] = '0';
                }
            }

        }

        System.out.print(ans);
    }
}