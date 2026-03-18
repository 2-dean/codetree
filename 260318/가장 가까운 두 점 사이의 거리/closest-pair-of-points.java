import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][2];

        for (int i = 0 ; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int minDiffX = Integer.MAX_VALUE;
        int minDiffY = Integer.MAX_VALUE;

        for (int i = 0; i  < n; i++) {
            
            for (int j = i + 1; j < n ; j++) {
                if (i == j) continue;
                // x비교
                int diffX = Math.abs(map[i][0] - map[j][0]);
                int diffY = Math.abs(map[i][1] - map[j][1]);

                minDiffX = Math.min(minDiffX, diffX);
                minDiffY = Math.min(minDiffY, diffY);
            }
        }

        System.out.print( minDiffX * minDiffX  + minDiffY * minDiffY );

    }
}