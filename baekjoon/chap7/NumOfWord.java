package baekjoon;
import java.util.Scanner;

public class NumOfWord {


		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt =0;
		
		try {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String [] sArr = s.split("\\s");
		int i=0;
		
		while(true) {
			
			if(sArr[i].isEmpty()){
				i++;
				}
			
			else {
				cnt++;
				i++;
				}
			}
		
		}
		
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(cnt);
		}
		
		catch(Exception e) {
			
		}
	}

}
