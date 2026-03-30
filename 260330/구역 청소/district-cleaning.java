import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        
        int sum = Math.abs((b-a) + (d-c)); 
        
        //겹치는 부분 빼줌
        if (!(b < c || d < a)) {
            if (a < d) {
                sum -= (d-a);
            } else {
                sum -= (d-a);
            }
        }

        System.out.print(sum);
    }                
}