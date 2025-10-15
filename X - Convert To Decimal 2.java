import java.util.Scanner;
 
public class codeforces {
    public static void main (String args[]){ 
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while (t-- > 0){
          int n = sc.nextInt();
          int bitCount = 0;
          while (n > 0){
            int q = n % 2;
            n /= 2;
            if (q == 1) bitCount++;
          }
          int dec = 0;
          for (int i = 0; i < bitCount; i++){
            dec += Math.pow(2,i); 
          }
          System.out.println(dec);
        }
        sc.close();
    }
}
