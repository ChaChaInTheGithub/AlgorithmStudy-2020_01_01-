package baekjoon;
import java.util.*;

public class Factorial {

	public static int factorial(int n) {
	if(n>=0) {
		if(n>1)
			return n*factorial(n-1);
		else
			return 1;
		 }
	else 
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println(factorial(num));
	}

}
