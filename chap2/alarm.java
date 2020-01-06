package baekjoon;
import java.util.Scanner;

public class alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner(System.in);
int hour = sc.nextInt();
int minute = sc.nextInt();
int time = 60* hour + minute;
if(time>45) {
time = time- 45;
System.out.print(time/60+ " ");
System.out.println(time%60);
}
else{
System.out.print("23 ");
System.out.println(59-(45-time)+1);
}
	}

}
