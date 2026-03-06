import java.util.Scanner;
public class Main {
    // W S N E
    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {-1, 0, 0, 1};

    static int[][] arr = new int[1001][1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N번 움직임

        int x = 500;
        int y = 500;

        arr[x][y] = 1;

        int dirNum = 0;
        int time = 0;

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

            if (dir == 'W') {
                dirNum = 0;
            } else if (dir == 'S'){
                dirNum = 1;
            } else if (dir == 'N'){
                dirNum = 2;
            } else {
                dirNum = 3; // E
            }
            // 이동
            for (int j = 0;  j< dist; j++) {
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];
                time ++;
                //처음자리
                if (arr[nx][ny] == 1 ){
                    System.out.print(time);
                    return;
                } 
                arr[nx][ny] = time;

                x = nx;
                y = ny;
            }

        }
            System.out.print(-1);

        // Please write your code here.
    }
}