import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		do {
 
			int n = sc.nextInt();
			int m = sc.nextInt();
 
			if (n > 0 && m > 0) {
			    
				int j = Math.min(n,m);
				int k = Math.max(n,m);
 
				int sum = 0;
				for (int i = j; i <= k; i++) {
					System.out.print(i + " ");
					sum += i;
				}
				System.out.print("sum =" +sum);
				System.out.println();
			}
            else break;
 
		} while (true);
 
		sc.close();
	}
}
