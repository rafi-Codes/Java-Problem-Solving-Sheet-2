import java.util.*;
 
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0){
            int n = sc.nextInt();
            long fact = 1;
            for (int i = n; i >= 1; i--){
                fact *= i;
            }
            System.out.println(fact);
        }
        sc.close();
    }
}
 
