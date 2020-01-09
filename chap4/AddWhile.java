package baekjoon;
import java.util.Scanner;
import java.util.Vector;

public class AddWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Vector<Integer> left = new Vector<Integer>(1,1);
Vector<Integer> right = new Vector<Integer>(1,1);
Vector<Integer> result = new Vector<Integer>(1,1);
int i=0;
int j=0;


while(true)
{
	left.add(sc.nextInt());
	right.add(sc.nextInt());
	result.add(left.elementAt(i)+right.elementAt(i));
	if(result.elementAt(i)==0)
		break;
	i++;
}	

while(result.elementAt(j)!=0) {
System.out.println(result.elementAt(j));
j++;
}

}
}
