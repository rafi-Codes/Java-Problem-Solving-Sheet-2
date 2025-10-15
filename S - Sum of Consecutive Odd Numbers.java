import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    int i = Math.min(x,y) + 1;
		    int n = Math.max(x,y);
		    
		    int sum = 0;
		    for (; i < n; i++){
		        if (i % 2 != 0){
		            sum += i;
		        }
		    }
		    System.out.println(sum);
		}
		
		sc.close();
	}
}
