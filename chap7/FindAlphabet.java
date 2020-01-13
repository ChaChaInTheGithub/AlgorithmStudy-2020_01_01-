package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s=sc.next();
int [] alpha = new int [26];
Arrays.fill(alpha, -1);

char [] arr = s.toCharArray();

for(int i =0 ; i<s.length() ; i++) {
	for(int j=0;j<26;j++) {
		if((byte)arr[i]==97+j&&alpha[j]==-1){
			alpha[j]=i;
			break;
			}
	}
}
for(int i=0;i<26;i++) {
	System.out.println(alpha[i]);
}
	}

}
