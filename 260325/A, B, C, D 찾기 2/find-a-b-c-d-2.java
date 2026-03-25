import java.util.*;

public class Main {
    static int[] arr = new int[15];
    static int[] myArr = new int[15];

    public static boolean isEqual() {
        Arrays.sort(arr);
        Arrays.sort(myArr);
        for(int i = 0; i< 15; i++) {
            if(arr[i] != myArr[i]) return false; 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }

        // Please write your code here.
        for (int a = 1; a <= 40; a++) {
            for (int b = 1; b <= 40; b++) {
                for (int c = 1; c <= 40; c++) {
                    for (int d = 1; d <= 40; d++) {
                        myArr[0] = a;
                        myArr[1] = b;
                        myArr[2] = c;
                        myArr[3] = d;
                        myArr[4] = a + b; 
                        myArr[5] = b + c;
                        myArr[6] = c + d; 
                        myArr[7] = d + a; 
                        myArr[8] = a + c;
                        myArr[9] = b + d;  
                        myArr[10] = a + b + c; 
                        myArr[11] = a + b + d;
                        myArr[12] = a + c + d;
                        myArr[13] = b + c + d;
                        myArr[14] = a + b + c + d;
                        if(isEqual()) {
                            System.out.print(a + " " + b + " " + c + " " + d);
                            System.exit(0);
                            //break;
                        }
                    }
                }
            }
        }
    }
}