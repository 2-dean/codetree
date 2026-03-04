import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, -1, 0, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        int dirNum = 3; // 북쪽
        int nx = 0;        
        int ny = 0;

        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c =='L') {
                dirNum = (dirNum - 1 + 4) % 4; // 
            } else if (c =='R') { // 방향 전환
                dirNum = (dirNum + 1) % 4;
            } else if (c == 'F') {// 해당 방향으로 -1 이동
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }
        }
       

        System.out.print(nx +  " " + ny);

    }
}