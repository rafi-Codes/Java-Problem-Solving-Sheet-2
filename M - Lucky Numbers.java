import java.util.*;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean found = false;
 
        for (int i = a; i <= b; i++) {
            String n = String.valueOf(i);
            boolean isLucky = true;
 
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(j) != '4' && n.charAt(j) != '7') {
                    isLucky = false;
                    break;
                }
            }
 
            if (isLucky) {
                System.out.print(i + " ");
                found = true;
            }
        }
 
        if (!found) {
            System.out.println("-1");
        }
 
        sc.close();
    }
}
