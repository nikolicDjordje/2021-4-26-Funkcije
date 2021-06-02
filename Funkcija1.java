package domaci;

import java.util.Scanner;

public class Funkcija1 {

	public static void main(String[] args) {
		
	/*	Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
	 * (znaci da korisnik unosi tri broja) i taj program treba da pozove i ispise (u mainu)
	 *  najmanji od ta tri unesena broja.
	 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		int prviBroj = sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		int drugiBroj = sc.nextInt();
		System.out.println("Unesite treci broj: ");
		int treciBroj = sc.nextInt();
		
	 int broj = najmanji( prviBroj, drugiBroj, treciBroj);
	 System.out.println("Najmanji od unesenih je: " + broj);

	} public static int najmanji(int a, int b, int c) {
		if (a < b && a < c) {
			return a;	
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}
			
		
	}
	

}
