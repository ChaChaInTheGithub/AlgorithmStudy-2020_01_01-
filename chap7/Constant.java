package baekjoon;
import java.util.Scanner;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a/100 + (a/10-a/100*10)*10+a%10*100;
		int d = b/100 + (b/10-b/100*10)*10+b%10*100;
		
		if(c>d)
			System.out.println(c);
		else
			System.out.println(d);
	}

}
