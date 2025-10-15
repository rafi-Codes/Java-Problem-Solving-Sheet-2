import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0){
		    
		    String num = sc.next();
		    String reverse = new StringBuilder(num).reverse().toString();
		    char[] numArr = reverse.toCharArray();
		    
		    for (char n : numArr){
		        System.out.print(n + " ");
		    }
		    System.out.println();
		}
		sc.close();
	}
}
