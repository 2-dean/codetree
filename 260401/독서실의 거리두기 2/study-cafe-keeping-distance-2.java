import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) - '0'; 
        }
        int minMaxDist = 0;
        for (int i = 0; i < n; i++) { //모든자리에 대해서
            if(arr[i] == 0) { // 앉히기
                arr[i] = 1;
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < n; j++){
                    if (arr[j] == 1){
                        list.add(j);
                    }
                }
                int minDist = 1000;
                for (int k = 0; k < list.size() - 1; k++) {
                    int dist = list.get(k + 1) - list.get(k) ;
                    //System.out.println("dist - " +dist);
                    minDist = Math.min(minDist, dist);
                }
                minMaxDist = Math.max(minMaxDist, minDist);
                arr[i] = 0;
            }
            
        }
            // 최소 거리중 최대 구하기

        System.out.print(minMaxDist);
    }
}