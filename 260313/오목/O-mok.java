import java.util.*;
import java.io.*;

public class Main {
    public static int[][] board = new int[19][19];
                            // 한방향만 체크 
    public static int[] dx = new int[]{1, 1, 1, -1, -1, -1, 0, 0};
    public static int[] dy = new int[]{-1, 0, 1, -1, 0, 1, -1, 1};
    public static int winner = 0;
    public static int winCol = -1;
    public static int winRow = -1;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < 19 && 0 <= y && y < 19;
    }
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 입력받기
        for (int i = 0; i < 19; i++) {
            st = new StringTokenizer(br.readLine()); 
            for (int j = 0; j < 19; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (board[i][j] == 0) continue; // 통과
                
                for (int k = 0; k < 8; k++) {
                    int count = 1;
                    int curX = i;
                    int curY = j;

                    while (true) {
                        int nx = curX + dx[k];
                        int ny = curY + dy[k];

                        if (inRange(nx, ny) == false) 
                            break;
                        if (board[nx][ny] != board[i][j]) 
                            break;
                        count++;
                        curX = nx;
                        curY = ny;

                        if(count == 5) {
                            System.out.println(board[i][j]);
                            System.out.print((i + 2 * dx[k] + 1) + " " + (j + 2 * dy[k] + 1));
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.print(0);
    }
}