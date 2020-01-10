package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class Midterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int [] score = new int [num];
float [] newScore = new float[num];
int max;
float avg=0;

for(int i=0;num>i;i++) {
	score[i]=sc.nextInt();
}
Arrays.sort(score);
max = score[num-1];

for(int i=0;num>i;i++) {
	newScore[i]=(float)score[i]/(float)max*100;
	avg+=newScore[i];
}

System.out.println(avg/(float)num);
	}

}
