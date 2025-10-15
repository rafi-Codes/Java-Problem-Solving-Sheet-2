import java.util.Scanner;
 
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= 4*n; i++){
          System.out.print(i + " ");
          cnt++;
          if (cnt == 3){
              System.out.println("PUM");
              cnt = 0;
              i++;
          }
        }
        sc.close();
    }
}
