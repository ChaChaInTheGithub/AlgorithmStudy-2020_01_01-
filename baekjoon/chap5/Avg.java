package baekjoon;
import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num= sc .nextInt();
int student;
double avg=0.0;
int [] score = new int [1000];
double [] board = new double [num];

for(int i=0;num>i;i++) {
	student = sc.nextInt();
	for(int j=0;student > j ;j++) {
		score[j]=sc.nextInt();
		avg+=score[j];
	}
	avg/=student;
System.out.println(avg);
	for(int j=0;student > j;j++) {
	if(score[j]>avg) {
		board[i]++;
		}
	}
	board[i]=board[i]/student*100.0;
	System.out.printf("%.3f%%\n",board[i]);
	avg=0.0;
	student=0;
}
	}

}
