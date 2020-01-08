package baekjoon;
import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; num>=i;i++) {
			for(int j=0;i>j;j++) {
			System.out.print("*");
		}
			System.out.print("\n");
	}

}
}
