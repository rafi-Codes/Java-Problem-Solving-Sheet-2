import java.util.*;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        String num;
        int tempSum;
 
        for (int i = 1; i <= n; i++){
           num = String.valueOf(i);
           tempSum = 0;
           for (int j = 0; j < num.length(); j++){
              tempSum += num.charAt(j) - '0';
           }
           if (tempSum >= a && tempSum <= b){
               sum += i;
           }
        }
 
        System.out.println(sum);
 
        sc.close();
    }
}
