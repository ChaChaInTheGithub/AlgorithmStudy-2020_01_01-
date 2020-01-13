package baekjoon;

public class SelfNum {
	
	public static boolean selfNum(int num) {
		int dNum;
		for(int i=1;num>i;i++) {
			dNum=i;
		if(num==10000)
			return false;
		else if(num>=1000 && num<=9999) {
			dNum+=i/1000+(i%1000-i%100)/100+(i%100-i%10)/10+i%10;
		}
		else if(num>=100 && num<=999) {
			dNum+=i/100+(i%100-i%10)/10+i%10;
		}
		else if(num>=10 && num <=99) {
			dNum+=i/10+i%10;
		}
		else {
		dNum+=i;	
		}
		
			if(num==dNum)
				return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
			for(int i=1;i<10000;i++) {
		if(selfNum(i)==true) {
			System.out.println(i);
		}
	}
		}
}
