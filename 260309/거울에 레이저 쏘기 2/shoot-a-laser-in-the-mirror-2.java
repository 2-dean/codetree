import java.util.Scanner;

public class Main {
    static int n;
    static int r = 0;
    static int c = 0;
    static int dirNum;
                   
                 // 북 동 남 서
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void checkStart(int num) {
        if (1 <= num && num <= n) {           // 위
            r = -1;
            c = num - 1;
            dirNum = 2;
        } 
        else if (n < num && num <= 2 * n) {   // 오른쪽
            r = num - n - 1;
            c = n;
            dirNum = 3;
        } 
        else if (2 * n < num && num <= 3 * n) { // 아래
            r = n;
            c = n - 1 - (num - 2 * n - 1);
            dirNum = 0;
        } 
        else {                                // 왼쪽
            r = n - 1 - (num - 3 * n - 1);
            c = -1;
            dirNum = 1;
        }
    }

    public static int changeDir(char d, int dirNum) {
        if (d == 'r') { // -> \
            if (dirNum == 0) dirNum = 3;
            else if (dirNum == 1) dirNum = 2;
            else if (dirNum == 2) dirNum = 1;
            else dirNum = 0;
        } else { // -> /
            if (dirNum == 0) dirNum = 1;
            else if (dirNum == 1) dirNum = 0;
            else if (dirNum == 2) dirNum = 3;
            else dirNum = 2;
        }
        return dirNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        // Please write your code here.
        
        // 시작좌표 확인\
        checkStart(startNum); // r,c 셋팅
        
        int count = 0;
        while(true) {
             // 방향전환 + 이동
            int nx = r + dx[dirNum];
            int ny = c + dy[dirNum];
            // 범위체크
            if(nx < 0 || nx >= n || ny < 0 || ny >= n) break;
            
            r = nx;
            c = ny;
            count++;
            // 거울 방향 체크
            if (grid[r][c] == '\\') {
                dirNum = changeDir('r', dirNum);
            } else { // => /
                dirNum = changeDir('l', dirNum);
            } 
            
        }
        System.out.print(count);
    }
}