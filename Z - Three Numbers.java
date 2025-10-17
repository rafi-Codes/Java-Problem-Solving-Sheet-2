import java.util.Scanner;
 
public class codeforces {
    public static void main (String args[]){ 
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int cnt = 0;
        for (int i = k; i >= 0; i--){ 
 
          int j = s - i; 
          if (j > k) j = k;
          int m = s - (i + j); 
          
          while (j >= m){
            cnt++;
            j--;
          }
        }
        System.out.println(cnt);
        sc.close();
    }
}
