import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (!nums.contains(arr[i])){
                nums.add(arr[i]);
            }
        }
        
        Collections.sort(nums);
        //System.out.println(nums.toString());
        int result = -1;
        int count = 0;
        
        if (nums.size() > 1) {
            int second = nums.get(1);

            for (int i = 0; i < N; i++) {
                if(arr[i] == second) {
                    result = i + 1;
                    count++;
                 
                }
            }
        }
        if (count > 1 || nums.size() <= 1) {
            System.out.print(-1);
        } else {
            System.out.print(result);
        }
        // Please write your code here.
    }
}