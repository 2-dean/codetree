import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] line = new char[200000];
        int[] black = new int[200000];
        int[] white = new int[200000];
        int cur = 100000; // 시작위치
        for (int i = 0; i < N; i++) {
            int dist = sc.nextInt(); // 칠할 타일 수
            char d = sc.next().charAt(0);
            if (d == 'R') { // 오른쪽 검정-> 현재 ~ 현재 + dist
                for (int j = cur; j < cur + dist; j++) {
                    black[j]++;
                    line[j] = 'B';
                }
                cur = cur + dist - 1;
            } else { // 왼쪽 -> 화이트 현재 - dist ~ 현재(포함)
                for (int k = cur; k > cur - dist; k-- ) {
                    white[k]++;
                    line[k] = 'W';
                }
                cur = cur - dist + 1;
            }
        }
        int w = 0;
        int b = 0;
        int g = 0;
        for (int i = 0; i <line.length; i ++) {
            if (white[i] >=2 && black[i] >= 2) {
                g++; // 흰검 두번씩 칠하면 회색
            } else if (line[i] == 'W') {
                w++;
            } else if (line[i] == 'B') {
                b++;
            }
        }
        // Please write your code here.
        System.out.print(w + " " + b + " " + g);
    }
}