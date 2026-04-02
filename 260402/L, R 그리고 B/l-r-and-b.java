import java.util.*;
public class Main {
                    // 상 우 하 좌
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N = 10;
    static char[][] arr = new char[10][10];
    static boolean[][] visited = new boolean[10][10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        int y = 0;

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for(int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] == 'L') {
                    x = i;
                    y = j;
                }
            }
        }

        //System.out.println("x = " + x + ", y = " + y);
        int result = bfs(x, y);
        // Please write your code here.  
        System.out.print(result);
    }

    public static int bfs(int startX, int startY) {
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            int dist = now[2];

            for (int dir=0; dir < 4; dir++){
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                //System.out.println("nx = " + nx + ", ny = " + ny);
                if (nx >= 0 && nx < N && ny >= 0 && ny <N && arr[nx][ny] != 'R' && !visited[nx][ny] ) {
                    if (arr[nx][ny] == 'B') return dist;

                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, dist+1});
                
                }
                

            }
            
        }
        
        return -1;

    }
}