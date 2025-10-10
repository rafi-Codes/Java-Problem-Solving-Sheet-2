import java.util.*;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
 
        for (int i = 0; i < n; i++){
            for (int j = 0; j < num[i]; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
 
        sc.close();
    }
}
