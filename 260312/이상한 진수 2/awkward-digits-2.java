import java.util.*;
public class Main {
    public static final int MAX_VAL = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int max = MAX_VAL;

        char[] arr = a.toCharArray();


        for (int i = 0; i < arr.length; i++) {
            // a 의 자릿수를 하나씩 반대로 바꾼다
            char org = arr[i];
            arr[i] = (arr[i] == '1') ? '0' : '1';

            String newStr = new String(arr);
            int num = Integer.parseInt(newStr , 2);
            max = Math.max(max, num);
            
            arr[i] = (arr[i] == '1') ? '0' : '1';
    
        }
         
        System.out.print(max);


    }
}