package baekjoon;
import java.util.Scanner;

public class SpecialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int cnt =0;
	int [] arr = new int [3];
	
	for(int i=1;num>=i;i++) {
		if(i<100) {
			cnt++;
		}
		else if(i>=100 && i<1000) {
	arr[0]=i%10;
	arr[1]=(i%100-i%10)/10;
	arr[2]=i/100;
	if(arr[0]+arr[2]==arr[1]*2) {
		cnt++;
	}
			}
		}
	System.out.println(cnt);
	}

}
