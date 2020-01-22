package baekjoon;
import java.util.Scanner;

public class Croatia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char [] arr = s.toCharArray();
		int []index = new int [3];
		int num = 0;
		
		for(int i=0;s.length()>i;i++) {
			
			if(i>0 && arr[i]=='-') {
				if(arr[i-1]=='d'||arr[i-1]=='c')
				{
					
				}
				else
					num++;
			}
			
			else if(i>0 && arr[i]=='j') {
				if(arr[i-1]=='l'||arr[i-1]=='n')
				{
					
				}
				else
					num++;
			}
			
			else if(i>0 && arr[i]=='=')
			{
				if(arr[i-1]=='z')
				{
					if(i>1 && arr[i-2]=='d')
						num--;
				}
				else if(arr[i-1]=='s'||arr[i-1]=='c')
				{
					
				}
				else
					num++;
			}
			else
				num++;
		}
		
		
		System.out.println(num);
	}

}
