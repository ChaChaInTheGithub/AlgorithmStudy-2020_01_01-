package baekjoon;
import java.util.Scanner;

public class AddCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int init = num;
int cnt = 0;

do{
	num = (num / 10 + num % 10)%10 + num%10*10;
	cnt++;
}while(num != init);

System.out.println(cnt);

	}
}
