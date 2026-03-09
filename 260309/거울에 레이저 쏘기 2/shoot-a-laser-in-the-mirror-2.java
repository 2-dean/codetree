import java.util.Scanner;

public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX_N = 1000;
    
    public static int n;
    public static char[][] arr = new char[MAX_N][MAX_N];

    public static int startNum;

    public static int x = 0; // col
    public static int y = 0; // row
    public static int moveDir;
                
    // 시작위치와 방향 구하기
    public static void initialize(int num) {
        if (num <= n) { // 위
            x = 0; y = num - 1; moveDir = 0;
        } 
        else if ( num <= 2 * n) {   // 오른쪽
            x = num - n - 1; y = n - 1; moveDir = 1;
        } 
        else if (num <= 3 * n) { // 아래
            x = num - 1 ; y = n - (num - 2 * n); moveDir = 2;
        } 
        else {  // 왼쪽
            x = n - (num - 3 * n); y = 0; moveDir = 3;
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void move(int nextDir) {
                    // 북 동 남 서
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        x += dx[nextDir];
        y += dy[nextDir];
        moveDir = nextDir;
    }

    public static int simulate() {
        int moveNum = 0;
        while (inRange(x, y)) {
            // 0 <-> 1 , 2 <-> 3
            if (arr[x][y] == '/') {
                move(moveDir ^ 1);
            } // 0 <-> 3 / 1 <-> 2
            else {
                move(3 - moveDir);
            }
            moveNum += 1;
        }
        return moveNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        startNum = sc.nextInt();
        // Please write your code here.
        
        // 시작 위치화 방향구하기
        initialize(startNum); // r,c 셋팅
        
        // (x, y)에서 moveDir 방향으로 시작하여
        // 시뮬레이션을 진행합니다.
        int moveNum = simulate();

        System.out.print(moveNum);
    }
}