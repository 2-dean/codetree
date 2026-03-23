import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        // Please write your code here.
        char[] arr = new char[n];

        for (int i = 0 ; i < n; i++) {
            arr[i] = s.charAt(i); 
        }


        // 길이 1부터 n까지
        for (int l = 1; l <= n; l++) {
            boolean isDup = false;// 

            // 길이가 l인 모든 부분 다 뽑아서 비교
            for (int i = 0 ; i <= n - l ; i++) {
                String sub1 = s.substring(i, i + l); 

                for (int j = i + 1; j <= n - l ; j++ ){
                    String sub2 = s.substring(j, j+l); // ㅓj부터 시작하는 l길이짜리

                    if (sub1.equals(sub2)) {
                        isDup = true;
                        break;
                    }      
                }
                if (isDup) break;
            }
            
            if (!isDup) {
               System.out.print(l);
                return;
            }
        }


    }
}