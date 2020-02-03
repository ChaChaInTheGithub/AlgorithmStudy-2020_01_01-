	package baekjoon;
	import java.util.Scanner;
	
	public class StringRecursion {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int caseT = sc.nextInt();
	
	for(int i=0;caseT>i;i++) {
		int recursion = sc.nextInt();
		String s = sc.next();
		char [] arr = s.toCharArray();
		for(int j=0;j<s.length();j++) {
			for(int k=0;recursion>k;k++) {
				System.out.print(arr[j]);
			}
		}
		System.out.println();
	}
		}
	
	}
