package baekjoon;
import java.util.Scanner; 

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int [] arr = new int[num];
int result = 0;

for(int i=0;num>i;i++) {
	arr[i]=sc.nextInt();
	
	for(int j=2;arr[i]>j;j++) {
		if(arr[i]%j==0)
			break;
		if(arr[i]==1||arr[i]-1==j)
			result++;
		}
	
	
	}

System.out.println(result);
	}

}
