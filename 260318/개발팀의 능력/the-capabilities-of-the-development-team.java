import java.util.*;
import java.io.*;

public class Main {
    
    public static int[] num = new int[5];

    public static int getDiff (int i, int j, int k, int l, int m) {
        int sum1 = num[i] + num[j];
        int sum2 = num[k] + num[l];
        int sum3 = num[m];
        // 세 팀의 능력치가 하나라도 겹치면 탈락 
        if (sum1 == sum2 || sum2 == sum3 || sum3 == sum1) {
            return -1;
        }
        int maxVal = Math.max(sum1, Math.max(sum2, sum3));
        int minVal = Math.min(sum1, Math.min(sum2, sum3));
        return maxVal - minVal;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());        
        int n = 5;
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int minAns = Integer.MAX_VALUE;        
        boolean possible = false; 

        // 1팀 2명
        for (int i = 0; i< n; i ++) {
            for (int j = i + 1; j < n; j++) {
                // 2팀 2명
                for(int k = 0; k < n; k++) {
                    for (int l = k+1; l < n; l++) {
                        if(k == i || k == j || l == i || l == j) continue;
                        //3팀 1명
                        for(int m = 0; m < n; m++) {
                            if (m == i || m == j || m == k || m == l) continue;
                           
                            int res = getDiff(i, j, k, l, m);
                            if (res != -1) { // 모두 다른 팀 점수를 가질 때만
                                minAns = Math.min(minAns, res);
                                possible = true;
                            }
                        }
                    }
                }
            }
        }
        if (!possible) System.out.print("-1");
        else System.out.print(minAns);
    }
}