import java.util.Scanner;

public class NumberPattern {
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);	
		
		System.out.print("Simple Number Pattern Rows = ");
		int rows = sc.nextInt();
		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = 1 ; j <= i; j++ ) 	
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}