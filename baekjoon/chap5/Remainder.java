package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int [] num = new int [10];
int [] remainder= new int [10];
int cnt=1;

for(int i=0;10>i;i++) {
	num[i]=sc.nextInt();
	remainder[i] = num[i] % 42;
}

Arrays.sort(remainder);

for(int i =0;9>i;i++) {
	if(remainder[i]!=remainder[i+1])
		cnt++;
}
System.out.println(cnt);
	}

}
