import java.util.Scanner;
public class Main {
    static int n; //r
    static int m; //c
                  // R / D / L / U
    static int[] dx = {0, 1, 0, -1}; // row
    static int[] dy = {1, 0, -1, 0}; // col
    
    static char[][] arr;
    
    //범위
    public static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        arr = new char[n][m];
        
        //current
        int cx = 0;
        int cy = 0;
        int dirNum = 0; // 방향 시작 
        
        arr[cx][cy] = 65;
        char c = 65;

        int cnt = 1;
        while (true){
            if (cnt == n * m) break;
        

            // 다음 x,y값
            int nx = cx + dx[dirNum];
            int ny = cy + dy[dirNum];
            // 범위 내 & 작성안됨 == 0으로 비교가능
            if (isRange(nx, ny) && arr[nx][ny] == 0) {
                // 값 갱신
                cx = nx;
                cy = ny;
                c++; 
                cnt++; 
            } else { // 방향전환
                dirNum = (dirNum + 1) % 4;
            }
            if (c == 91) c = 65;
            arr[cx][cy] = c;
          
        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}