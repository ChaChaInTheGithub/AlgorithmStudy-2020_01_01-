package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class NumOfAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s = sc.next();
char [] word = s.toCharArray();
int [] score = new int [26];
for(int j=0;s.length()>j;j++) {
	for(int i=0;i<26;i++) {
		if((byte)word[j]==97+i||(byte)word[j]==65+i)
			score[i]++;
	}
}

int [] copied = Arrays.copyOf(score,26);

Arrays.sort(score);

if(score[25]==score[24])
	System.out.println("?");

else {
	for(int i=0;i<26;i++) {
		if(copied[i]==score[25]) {
			System.out.println((char)(65+i));
			break;
		}
	}
	
}
	}

}
