package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String [] a = new String [10];
		
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i = 0; i < 10; i++) {
			a[i]= scanner.nextLine();
			
		}
	scanner.close();
		System.out.print( a[0] + a[1] + a[2] +a[3] +a[4] +a[5] +a[6] +a[7] +a[8] +a[9] );
		
		
	}
}

/*
 * package q555;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      String[] strX = new String[10];
      int size = strX.length;

      for (int i = 0; i < size; i++) {
         strX[i] = scanner.next();
         System.out.print(strX[i]);
      }
      scanner.close();
   }

}
 */

/*
 * char[] ar = new char[10];
 * Scanner sc = new Scanner(System.in);
 * for(int i = 0; i<=9; i++){
 * }
 */

