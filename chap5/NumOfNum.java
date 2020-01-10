package baekjoon;
import java.util.Scanner;

public class NumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int [] arr = new int [3];
int result=1;
String res;
byte [] bArr;
int[]num=new int [10];

for(int i =0;i<3;i++) {
arr[i] = sc.nextInt();
result=result*arr[i];
}

res = Integer.toString(result);
bArr = res.getBytes();
for(int i=0;10>i;i++) {
	for(int j=0;res.length()>j;j++) {
		if((byte)bArr[j]==48+i) {
			num[i]++;
			}		
	}
}
for(int i=0;i<10;i++) {
	System.out.println(num[i]);
}
	}
}
