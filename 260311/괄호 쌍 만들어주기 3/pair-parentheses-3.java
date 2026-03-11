import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int k = i+1; k < s.length(); k++) {
                if (s.charAt(i) == '(' && s.charAt(k)== ')') {
                    count++;
                }
            }   
        } 
    

        System.out.print(count);
    }
}