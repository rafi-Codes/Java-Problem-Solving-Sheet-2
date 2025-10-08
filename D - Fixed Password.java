import java.util.*;
 
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        do {
           int n = sc.nextInt();
           if (n == 1999){
               System.out.println("Correct");
               break;
           } else {
               System.out.println("Wrong");
           }
        } while (true);
        sc.close();
    }
}
