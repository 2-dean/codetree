import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        
    
        
        //겹치지 않는경우
        if (b < c || d < a) {
            System.out.print((b-a) + (d-c)); 
        } else {
            Sytem.out.print(Math.max(b, d) - Math.min(a,c));
        }
    }                
}