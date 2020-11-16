import java.util.Scanner;

public class J3{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++){
			String line = s.next();
			int count = 1;
			for (int p = 0; p < line.length(); p++){
				if (p == line.length()-1){
					if (line.charAt(p) == line.charAt(p-1)){
						System.out.print(count + " " + line.charAt(p) + " ");
					}
					else{
						System.out.print(1 + " " + line.charAt(p) + " ");
						count = 0;
					}
				}
				else{
					if (line.charAt(p) == line.charAt(p+1)){
						count++;
					}
					else{
						System.out.print(count + " " + line.charAt(p) + " ");
						count = 1;
					}
				}
			}
			System.out.println();
		}
	}
}