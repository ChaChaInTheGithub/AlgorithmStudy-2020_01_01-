package baekjoon;
import java.util.Scanner;
public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int score=sc.nextInt();
if(score<=59)
	System.out.println("F");
else if(score<=69)
	System.out.println("D");
else if(score <=79)
	System.out.println("C");
else if(score <=89)
	System.out.println("B");
else if(score <=100)
	System.out.println("A");
	}

}
