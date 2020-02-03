package baekjoon;
import java.util.Scanner;

public class addTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int tabNum=sc.nextInt();
		int [] right=new int [tabNum];
		int [] left=new int [tabNum];
		int [] result = new int[tabNum];
		for(int i=0;i<tabNum;i++) {
			right[i]=sc.nextInt();
			left[i]=sc.nextInt();
			result[i]=right[i]+left[i];
		}
		for(int i=0;i<tabNum;i++) {
			System.out.println(result[i]);
		}
	}

}
