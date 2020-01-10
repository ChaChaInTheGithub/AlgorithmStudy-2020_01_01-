package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class Music {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		int [] arr = new int [8];
		int [] comp = new int [8];
		int j=0;
		
		for(int i=0;8>i;i++) {
	arr[i]=sc.nextInt();
	comp[i]=arr[i];
}
		Arrays.sort(comp);
		
		while(8>j) {
			if(arr[j]==comp[j])
				j++;
			else 
				break;
		}
		
		if(j==8) {
			System.out.println("ascending");
			return;
		}
		
		j=0;
		
		while(8>j) {
			if( arr[j]==comp[7-j])
				j++;
			else
				break;
		}
		
		if(j==8) {
			System.out.println("descending");
		}
		
		else {
			System.out.println("mixed");
		}
	}

}
