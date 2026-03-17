import java.util.*;
import java.io.*;

public class Main {
    public static int[] num = new int[6];

    public static int getDiff (int i, int j, int k, int l) {
        int sum1 = num[i] + num[j];
        int sum2 = num[k] + num[l];
        int totSum = 0;
        for (int x : num) {
            totSum += x;
        }
        int sum3 = totSum - (sum1+sum2); // 3팀의 합

        // 3팀중 최대 최소
        int maxVal = Math.max(sum1, Math.max(sum2, sum3));
        int minVal = Math.min(sum1, Math.min(sum2, sum3));

        return maxVal - minVal;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = 6;
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int minAns = Integer.MAX_VALUE;       
        // 1팀 i,j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // 2팀 j,l
                for (int k = 0; k < n; k ++) {
                    for (int l = k + 1; l < n; l++){
                        if (k == i || k == j || l == i || l == j) continue; //1팀, 2팀 겹치면안됨
                        int minDiff = getDiff(i, j, k, l);

                        minAns = Math.min(minDiff, minAns);
                    }
                }
            }
        }
        System.out.print(minAns);
    }
}