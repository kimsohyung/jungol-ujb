package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strX = scanner.nextLine();
		scanner.close();
		
		int x = Integer.parseInt(strX);
		
		if(x>0) {
			System.out.println(x);
		}else {
			System.out.println(x);
			System.out.println("minus");
		}
		/*
		 * System.out.println(x);
		 * if(x<=0){
		 * 		System.out.println(minus");
		 * }
		 */

	
	}

}
/*Scanner sc = new Scanner(System.in)
 * int inp = sc.nextInt();
 * 
 * System.out.println(inp);
 * if(inp < 0 ){
 *	System.out.println("minus");
 *}else{
 *
 *}
 */

