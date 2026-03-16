import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int n;
        int m;
        int[] arrA;
        int[] arrB;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arrA = new int[n];
        arrB = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        } 



        // 연속 수열의 수 세기
        // b를 정렬
        Arrays.sort(arrB);

        int count = 0;
        //arrA에서 길이가 M만큼인거를 확인
        for (int i = 0; i <= n - m; i++) {
            int[] temp = new int[m];
            for(int j = 0 ; j < m; j++) {
                temp[j] = arrA[i + j];
            }
            // 구간정렬
            Arrays.sort(temp);

            boolean isSame = true;
            for (int k = 0; k < m; k++) {
                if (arrB[k] != temp[k]) {
                    isSame = false;// 하나라도 다르면
                    break;
                }
            }
            if(isSame) {
                count++;
            }
        }
        System.out.print(count);
    }
}