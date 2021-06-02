package domaci;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

/* DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima ->
 *  Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve metode. 
 *  Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva.
 */

Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj: ");
		int prviBroj = sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		int drugiBroj = sc.nextInt();
		System.out.println("Unesite treci broj: ");
		int treciBroj = sc.nextInt();
		
		int zbir = sabiranje(prviBroj, drugiBroj, treciBroj);
		System.out.println("Zbir unetih brojeva je: " + zbir);
		
		int max = najveci(prviBroj, drugiBroj, treciBroj);
		System.out.println("Najveci od unetih brojeva je: " + max);

	} 
	public static int sabiranje (int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
 public static int najveci (int a, int b, int c) {
	 if (a > b && a > c)  {
		 return a;
	 } else if ( b > a && b > c) {
		 return b;
	 } else {
		 return c;
	 }
 }
}
