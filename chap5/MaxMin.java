package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);	
int num = sc.nextInt();
int [] arr = new int [num];

for(int i=0;num > i ; i++) {
arr[i]=sc.nextInt();	
}

Arrays.sort(arr);
System.out.print(arr[0]+" "+arr[num-1]);
	}

}
