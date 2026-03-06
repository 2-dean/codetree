import java.util.Scanner;
public class Main {
    // W S N E
    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {-1, 0, 0, 1};

    static int[][] arr = new int[1001][1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N번 움직임

        int x = 0;
        int y = 0;

        arr[x][y] = 1;

        int dirNum = 0;
        int time = 0;

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

            // dir 방향
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
                x += dx[dirNum];
                y += dy[dirNum];
                //시간 기록
                time ++;
                //처음자리 (0,0)
                if (x == 0 && y == 0){
                    System.out.print(time);
                    return;
                } 
            }

        }
        System.out.print(-1);

        // Please write your code here.
    }
}