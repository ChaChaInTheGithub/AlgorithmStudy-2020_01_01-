package baekjoon;
import java.util.Scanner;

public class Dial {

	public static int dial(char s) {
		int num=2;
		
		for(int i=0;i<7;i++) {
		if((byte)s>=65+3*i&&(byte)s<65+3*(i+1))
			num+=1+i;
		}
		if((byte)s>=80&&(byte)s<=83)
			num=8;
		else if((byte)s>=84&&(byte)s<=86)
			num=9;
		else if((byte)s>=87&&(byte)s<=90)
			num=10;
		
		return num; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s = sc.next();
char [] arr = s.toCharArray();
int result=0;

for(int i=0;s.length()>i;i++) {
	result+=dial(arr[i]);
}
System.out.println(result);
	}

}
