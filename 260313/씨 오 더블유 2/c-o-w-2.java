import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        // Please write your code here.
        int count = 0;
        for (int i = 0 ; i < n; i++ ) { // find C
            for (int j = i+1; j < n; j++ ){ // find O
                for (int k = j + 1; k < n ; k ++) { // find W
                        if (s.charAt(i) == 'C' && s.charAt(j) == 'O' && s.charAt(k) == 'W') {
                            count++;
                        }
                    
                }
            }
        }
        System.out.print(count);
    }
}