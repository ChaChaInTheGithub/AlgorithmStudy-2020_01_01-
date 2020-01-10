package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int [] arr = new int [9];
int [] sorted = new int [9];
int index=0;
int max;

for(int i=0;9>i;i++) {
	arr[i]=sc.nextInt();
	sorted[i]=arr[i];
}
Arrays.sort(sorted);

while(true) {
	if(sorted[8]==arr[index]) 
		break;
	index++;
}
max=arr[index];
System.out.println(max+"\n"+(index+1));

	}

}
