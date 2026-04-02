import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
      
        int idx = n - 1;
        while (idx > 0 && numbers[idx - 1] < numbers[idx]) {
            idx--;
        }

        // 전체 개수에서 이미 정렬된 뒷부분 개수를 빼면 정답! ㅋ ㅡㅡ;
        // idx가 가리키는 곳이 "정렬된 구간의 시작점"이니까, 그 앞의 개수는 idx와 같습니다.
        System.out.print(idx);
    
    }
}