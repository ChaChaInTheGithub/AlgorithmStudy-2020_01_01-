package baekjoon;
import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int arrayNum=sc.nextInt();
int checkNum = sc.nextInt();
int [] arr = new int[arrayNum];

for(int i = 0;arrayNum>i;i++) {
	arr[i]=sc.nextInt();
}

for(int i=0;arrayNum>i;i++) {
	if(arr[i]<checkNum)
		System.out.println(arr[i]);
}


	}

}
