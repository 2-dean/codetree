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
        int maxBombNum = 0;
        boolean isbombed = false;
        int bombNum = 0;
        if (n == k) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (bombs[i] == bombs[j]) {
                        isbombed = true;
                        bombNum = bombs[i];
                        //System.out.println("bombNum : " + bombNum);
                        break;
                    } 
                }
                maxBombNum = Math.max(maxBombNum, bombNum);

            }
        } else {
            for (int i = 0 ; i < n - k; i++) {
                for (int j = i + 1; j <= i + k; j++) {
                    if (bombs[i] == bombs[j]) {
                        isbombed = true;
                        bombNum = bombs[i]; 
                        break;
                    }
                }
                maxBombNum = Math.max(maxBombNum, bombNum);
            }
        }

        if (isbombed) {
            System.out.print(maxBombNum);
        } else {
            System.out.print(-1);
        }
    }
}