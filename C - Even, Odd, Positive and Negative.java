import java.util.*;
 
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        
        int even = 0, odd = 0, neg = 0, pos = 0;
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            if (num[i] > 0) pos++;
            if (num[i] < 0) neg++;
            if (num[i] % 2 == 0) even++;
            if (num[i] % 2 != 0) odd++;
        }
        
        System.out.println("Even: "+ even);
        System.out.println("Odd: "+ odd);
        System.out.println("Positive: "+ pos);
        System.out.println("Negative: "+ neg);
    }
}
