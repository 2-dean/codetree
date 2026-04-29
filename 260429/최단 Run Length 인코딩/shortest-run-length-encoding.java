import java.util.*;

public class Main {

    static char[] arr;

    static void doShift() {
        char temp = arr[arr.length - 1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    static int runLengthEncoding () {
        char nowChar = arr[0];
        int count = 1;

        StringBuilder sb = new StringBuilder();
        sb.append(nowChar);        
        for (int i = 1; i < arr.length; i++) {
            if (nowChar != arr[i]) {
                sb.append(count);
                nowChar = arr[i];
                sb.append(nowChar);
                count = 1;
            } else {
                count++;
            }         
        } 
        sb.append(count);

        //System.out.println(sb.toString());
        return sb.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        arr = A.toCharArray();
        int count = A.length()-1;
        int minLength = A.length();

        while (count-- > 0) {
            //shift
            doShift();
            // run-length Encoding
            int size = runLengthEncoding();
            minLength = Math.min(minLength, size);
        }

        System.out.println(minLength);
    }
}