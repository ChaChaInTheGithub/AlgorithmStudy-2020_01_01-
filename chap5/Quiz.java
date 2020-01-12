package baekjoon;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
String quiz;
int score = 0;
int serial = 0;

for(int i=0;num>i;i++) {
	quiz=sc.next();
	for(int j=0;quiz.length()>j;j++) {
			if(quiz.charAt(j)=='O') {
				serial++;
				score+=serial;
			}
			else
				serial=0;
	}
	System.out.println(score);
	score=0;
	serial=0;
}


	}

}
