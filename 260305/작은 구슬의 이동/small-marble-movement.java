import java.util.Scanner;

public class Main {
    static int N; // 배열크기
    
    public static boolean inRange(int x, int y) {
        return (0 <= x && x < N && 0 <= y && y < N);
    }
    
    public static int getDir (char a) {
        if (a == 'R') {
            return 0;
        } else if (a == 'D') {
            return 1;
        } else if (a == 'U') {
            return 2;
        } else {
            return 3;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 배열크기
        int T = sc.nextInt(); // T초
        int R = sc.nextInt(); // y
        int C = sc.nextInt(); // x
        String D = sc.next(); // 방향
        
        // Please write your code here.
        // R D U L
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, 1, -1, 0};

        int dirNum = getDir(D.charAt(0));
        
        int x = C - 1;
        int y = R - 1;
        while (T-- > 0) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            if (!inRange(nx, ny)) {
                // 방향 반대로
                dirNum = 3 - dirNum;
            }else {
                // 이동 가능할 때만 이동
                x = nx;
                y = ny;
            }
        
        }
   
        
        System.out.print((y+1) + " " + (x+1));
    }
}