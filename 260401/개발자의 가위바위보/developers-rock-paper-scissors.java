import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] rounds = new int[n][2];
     
        for(int i = 0; i < n; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            rounds[i][0] = first;
            rounds[i][1] = second;
        }
        
        // 가능한 매칭
        // 0: 가위, 1:바위, 2: 보
        int[][] combinations = {
            {0, 1, 2}, {0, 2, 1}, {1, 0, 2},
            {1, 2, 0}, {2, 0, 1}, {2, 1, 0}
        };

        int maxWin = 0;

        for (int[] config : combinations) {
            int currentWin = 0;

            for (int i = 0; i < n; i++) {
                int p1 = config[rounds[i][0] - 1];
                int p2 = config[rounds[i][1] - 1];
            
                // 가위바위보 승리판정
                if (isWin(p1, p2)) {
                    currentWin++;
                }
            }
            maxWin = Math.max(maxWin, currentWin);
        }
        System.out.println(maxWin);
    }


    // p1 이 이기는지 체크 // 0: 가위, 1: 바위, 2: 보
    public static boolean isWin(int p1, int p2) {
        if(p1 == 0 && p2 == 2) return true; // 가위/보
        if(p1 == 1 && p2 == 0) return true; // 바위/가위
        if(p1 == 2 && p2 == 1) return true; // 보/바위  
        return false;
    }

} 