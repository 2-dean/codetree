import java.util.Scanner;

public class Main {
    static int n;
    static int r = 0;
    static int c = 0;
    static int dirNum;
                    // 북 동 남 서
    static int[] dx = {1, 0, -1, 0};   //r
    static int[] dy = {0, 1, 0, -1};   //c
    public static void checkStart(int num) {
        if (1 <= num && num <= n) {           // 위
            r = 0;
            c = num -1;
            dirNum = 2;
        } 
        else if (n < num && num <= 2 * n) {   // 오른쪽
            r = num - n - 1;
            c = n - 1;
            dirNum = 3;
        } 
        else if (2 * n < num && num <= 3 * n) { // 아래
            r = n - 1;
            c = n - 1 - (num - 2 * n - 1);
            dirNum = 0;
        } 
        else {                                // 왼쪽
            r = n - 1 - (num - 3 * n - 1);
            c = 0;
            dirNum = 1;
        }
    }

    public static intt changeDir(char d, int dirNum) {
        if (d == 'r') { // -> \
            if (dirNum == 0) dirNum = 1;
            else if (dirNum == 3) dirNum = 2;
            else if (dirNum == 2) dirNum = 3;
            else dirNum = 0; //dirnum ==1 
        } else { // -> /
            if (dirNum == 0) dirNum = 3;
            else if (dirNum == 1) dirNum = 2;
            else if (dirNum == 2) dirNum = 3;
            else dirNum = 0; //dirnum ==1 
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
            // 거울 방향 체크
            if (grid[r][c] == '\\') {
                changeDir('r', dirNum);
            } else { // => /
                changeDir('l', dirNum);
            }
            // 방향전환 + 이동
            int nx = r + dx[dirNum];
            int ny = c + dy[dirNum];
            // 범위체크
            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                r += nx;
                c += ny;
                count++;
            } else {
                break;
            }
        }
        System.out.print(count);
    }
}