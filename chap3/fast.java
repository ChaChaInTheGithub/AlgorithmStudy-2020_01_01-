package baekjoon;
import java.io.*;
import java.util.StringTokenizer;

public class fast {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(bf.readLine());
		int [] right = new int [num];
		int [] left = new int [num];
		int [] result = new int [num];
		String s;
		for(int i=0;num>i;i++) {
			s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			right[i] = Integer.parseInt(st.nextToken());
			left[i] = Integer.parseInt(st.nextToken());
			result[i] = right[i]+ left[i];
		}
		for(int i=0;num>i;i++)
			bw.write(result[i]+"\n");
	
		bw.flush();
		bw.close();
	}

}
