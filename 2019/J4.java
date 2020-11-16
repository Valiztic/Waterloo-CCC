import java.util.Scanner;

public class J4{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		String line = s.next();
		int[] a = {1, 2};
		int[] b = {3, 4};
		int[][] c = {a, b};
		int n = 0;
		int m = 0;
		for (int i = 0; i < line.length(); i++){
			if (line.charAt(i) == 'H'){
				n = c[1][0];
				m = c[1][1];
				c[1][0] = c[0][0];
				c[1][1] = c[0][1];
				c[0][0] = n;
				c[0][1] = m;
			}
			else{
				n = c[0][1];
				m = c[1][1];
				c[0][1] = c[0][0];
				c[1][1] = c[1][0];
				c[0][0] = n;
				c[1][0] = m;
			}
		}
		System.out.print(c[0][0] + " " + c[0][1] + "\n" + c[1][0] + " " + c[1][1]);
	}
}