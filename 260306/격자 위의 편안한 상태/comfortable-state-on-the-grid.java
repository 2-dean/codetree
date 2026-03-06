import java.util.Scanner;

public class Main {
                        // 동남서북
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        int[][] points = new int[m][2];
        
        for (int i = 0; i < m; i++) { // 색칠할 칸의 위치
            int y = sc.nextInt()-1; //r행
            int x = sc.nextInt()-1; //c열

            arr[y][x] = 1;
            
            int count = 0; 

             //탐색
            for (int dir = 0 ; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (arr[ny][nx] == 1) count++;
                }
        
            }
        
            if (count == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            count = 0;
        }

    
        // Please write your code here.
    }
}