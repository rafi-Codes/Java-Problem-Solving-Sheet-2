import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> div = new ArrayList<>();
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                div.add(i);
            }
        }
        div.add(n);
        for (int i : div){
            System.out.println(i);
        }
        sc.close();
    }
}
