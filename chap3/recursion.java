package baekjoon;
import java.util.Scanner;
public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int result=0;

for(int i=0 ; num>=i ;i++) {
	result = result+i;
}

System.out.println(result);

	}

}
