package baekjoon;
import java.util.Scanner;

public class rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int result;
		a= sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		result = (a+b)%c; 
		System.out.println(result);
		result = (a%c+b%c)%c;
		System.out.println(result);
		result = (a*b)%c;
		System.out.println(result);
		result = (a%c*b%c)%c;
		System.out.println(result);
	}

}
