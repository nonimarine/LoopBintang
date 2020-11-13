package com.cilsy;

public class Bintang {
	public static void main(String[] args) {
		
		System.out.println("Soal 1");
		 int a = 5;
	       for (int b = 1; b <= a; b++){
	           for (int c = 4; c >= b; c--) {
	               System.out.print(' ');
	           }
	           for (int d = 1; d <= b; d++){
	               System.out.print('*');
	           }
	           System.out.println();
	       }

		System.out.println("Soal 2");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // ini untuk menciptakan line baru
		}

		System.out.println("Soal 3");

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		System.out.println("Soal 4");
		int i, j, k;

		 for (i=5;i>=1;i--) {
			 
			  for (j=5;j>i ; j--) {
			    System.out.print(" ");/*untuk mencetak spasi */
			   }
			  for (k=1; k<=j; k++) {
			   System.out.print("*");//mencetak bintang bagian kedua/bagian bawah
			   }
			   System.out.println(); // mencetak baris baru
			  }
			}
}