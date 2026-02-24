import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        int[][] paper = new int[2001][2001];

        for (int i = 0; i < n; i++) { // -100 보정
            x[i] = sc.nextInt() + 100;
            y[i] = sc.nextInt() + 100;
            // 좌측하단 꼭지점 위치만 주어짐
            for (int j = x[i]; j < x[i] + 8; j++) {
                for (int k = y[i]; k < y[i] + 8; k++) {
                    paper[j][k]++;
                }
            }
        }

        int count = 0;
        for (int i = 0; i< paper.length; i++) {
            for (int j = 0; j < paper[i].length; j++) {
                if(paper[i][j] > 0 ) count ++;
            }
        }
        // Please write your code here.
        System.out.print(count);
    }
}