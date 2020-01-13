package baekjoon;
import java.util.Scanner;;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
String s = sc.next();
char [] arr = s.toCharArray();
int [] arrInt = new int[s.length()];
int sum=0;

for(int i=0;s.length()>i;i++) {
	arrInt[i]= Integer.parseInt(String.valueOf(arr[i]));
	sum+=arrInt[i];
}

System.out.println(sum);
	}

}
