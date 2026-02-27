import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생
        int m = sc.nextInt(); // 벌칙에 걸린 학생 번호 순서
        int k = sc.nextInt(); // k번 이상 벌칙-벌금
        // 최초로 벌금내는 학생?

        int[] students = new int[n+1];
        int[] penalizedPerson = new int[m]; 
        // 최초로 벌금내는 학생?
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }
        int result = -1;
        for (int i = 0; i < m; i++) {
            int s = penalizedPerson[i];
            students[s]++;
            if (students[s] >= k) {
                result =  s;
                break;
            }
        }
        System.out.print(result);
        // Please write your code here.
    }
}