package baekjoon;
import java.util.Scanner;

public class Fibonnaci {

	public static int fibo(int n,int cnt) {
		if(n==0)
			return 0;
		
		else if(n==1)
			return 1;
		
		else if(n==2)
			return 1+fibo(n-1,cnt+1);
		
		else
			return n+fibo(n-1,cnt+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(fibo(n,0));
	}
}