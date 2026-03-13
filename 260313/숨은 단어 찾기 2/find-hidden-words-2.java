import java.util.Scanner;
public class Main {
public static int n;
public static int m;
    public static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    public static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static boolean inRange (int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // String[] arr = new String[n];

        char[][] board  = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);            
            }
        }
        int count = 0;

        for (int i = 0; i < n ; i++ ){
            for (int j = 0; j < m ; j++) {
                // 탐색
                if (board[i][j] == 'L') {
                    for (int dir = 0; dir < 8; dir ++){
                        int nx = i + dx[dir];
                        int ny = j + dy[dir];

                        if (inRange(nx, ny) && board[nx][ny] == 'E') {
                            int nnx = nx + dx[dir];
                            int nny = ny + dy[dir];

                            if (inRange(nnx, nny) && board[nnx][nny] == 'E'){
                                count++;
                            }
                        }   
                    }
                    
                }
            }
        }
        System.out.print(count);
    }
}