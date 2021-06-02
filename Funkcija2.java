package domaci;

import java.util.Scanner;

public class Funkcija2 {

	public static void main(String[] args) {
		/*Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza
		i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj: ");
		int prviBroj = sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		int drugiBroj = sc.nextInt();
		System.out.println("Unesite treci broj: ");
		int treciBroj = sc.nextInt();
		
		int proizvod = mnozenje( prviBroj, drugiBroj, treciBroj);
		System.out.println("Proizvod unetih brojeva je: " + proizvod);
		
		
	} public static int mnozenje (int a, int b, int c)  {
		int d = a* b * c;
		return d;
	}

}
