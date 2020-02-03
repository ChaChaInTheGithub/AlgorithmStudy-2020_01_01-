package baekjoon;
import java.util.Scanner;

public class Fibonnaci {

	public static int fibo(int n) {
	if(n>=2)
		return fibo(n-1)+fibo(n-2);
	else if(n==1)
		return 1;
	else 		
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibo(n));
	
	}
}