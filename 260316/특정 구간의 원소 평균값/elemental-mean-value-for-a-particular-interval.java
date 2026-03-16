import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int count = 0;

        for (int i = 0 ; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sumVal = 0; 
                int elementsCnt = j - i + 1; // 구간의 갯수
                
                // 구간의 합
                for (int k = i; k <= j; k++){
                    sumVal += arr[k];
                }

                //평균이 정수
                if (sumVal % elementsCnt == 0) {
                    int average = sumVal / elementsCnt;
                    

                    // 평균값이 구간내에 존재?
                    boolean exists = false;

                    for (int k = i; k <= j; k++){
                        if(average == arr[k]) {
                            exists = true;
                            break; // 하나라도 찾으면 끝;
                        }                 
                    }
                    if (exists) count++;
                }
            }
        }
        System.out.print(count);
    }
}