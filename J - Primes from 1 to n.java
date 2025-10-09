import java.util.*;
 
public class Main {
    public static void sieve(boolean[] arr, int n) {
        arr[0] = arr[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (arr[i]) {
                for (int j = i * i; j < n; j += i) {
                    arr[j] = false;
                }
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = (int) 1e3 + 1;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        sieve(arr, n);
        
        for (int i = 0; i <= t; i++){
            if (arr[i]){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
