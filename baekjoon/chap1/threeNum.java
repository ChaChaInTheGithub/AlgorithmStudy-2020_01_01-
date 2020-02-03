package baekjoon;
import java.util.Scanner;

public class threeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int q;
		int result;
		a=sc.nextInt();
		b=sc.nextInt();
		q = b % 10;
		result = a*q;
		System.out.println(result );
		q = (b/10)-(b / 100 * 10);
		result = a*q;
		System.out.println(result);
		q= b/100;
		result = a* q;
		System.out.println(result);
		result = a*b;
		System.out.println(result);
		
	}

}
