import java.util.Scanner;
 
public class codeforces {
    public static void main (String args[]){ 
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++){
          System.out.print(first + " ");
          int third = first + second;
          first = second;
          second = third;
        }
        sc.close();
    }
}
