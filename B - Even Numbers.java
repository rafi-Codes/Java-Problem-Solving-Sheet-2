import java.util.*;
 
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
 
        if (n < 2) {
            System.out.println("-1");
        } else {
            for (int i = 2; i <= n; i += 2) {
                System.out.println(i);
            }
        }
    }
}
