import java.util.*;
import java.io.*;


public class Main {

    static int n;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); //from
            arr[i][1] = Integer.parseInt(st.nextToken()); //to(미포함)
        }    
        
        int maxOpertTime = 0;
        for (int i = 0; i < n ; i++) {
            int sumOpertTime = 0;
            int[] time = new int[10];

            for (int j = 0; j < n ; j++) {
                // 한명만 제외
                if (i == j) continue;
                int start = arr[j][0];
                int end = arr[j][1];

                for (int k = start; k < end; k++) {
                    time[k]++;
                }      

            }
            for (int l = 0 ; l < time.length; l++) {
                if (time[l] != 0) sumOpertTime++;
            }
            maxOpertTime = Math.max(maxOpertTime, sumOpertTime);
        }

        System.out.print(maxOpertTime);
    }

}