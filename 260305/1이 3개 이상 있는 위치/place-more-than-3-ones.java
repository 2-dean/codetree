import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] arr;
    
    //(상하좌우)
    static int[] dx = new int[] {1, 0, -1, 0};
    static int[] dy = new int[] {0, -1, 0, 1};

    public static void main(String[] args)  throws IOException  {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
      
        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N ; j ++) {
                int x = i;
                int y = j;
                int cnt = 0;

                // 4방향탐색
                for (int dirNum = 0; dirNum <4; dirNum++ ) {
                    int nx = x + dx[dirNum];
                    int ny = y + dy[dirNum];
                    if (nx >=0 && nx < N && ny >=0 && ny < N) {
                        if (arr[nx][ny] == 1) {
                            cnt ++;
                        }      
                    }     
                }
                if (cnt >= 3) {
                    result++;
                }
            }
    
        }

        System.out.print(result);

        
    }
}