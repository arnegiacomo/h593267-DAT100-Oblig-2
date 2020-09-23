package no.hvl.dat100;

public class Oppgave3 {
	
	// a)
	public static void skrivUtv1(int[][] matrise) {
		for (int i[] : matrise) {
			for (int j : i) {
				System.out.printf("%5d ", j);
			}								  
		System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String tilbakeStreng = "";
		for (int i[] : matrise) {
			for (int j : i) {
				tilbakeStreng += j + " ";
					}
			tilbakeStreng += "\n";
			}
		return tilbakeStreng;
		
	}
	
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = matrise;
			for (int i = 0; i <= matrise.length-1; i++) {
				for (int j = 0; j <= matrise[i].length-1; j++)
					nyMatrise[i][j] = matrise[i][j]*tall;
			}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		if (mat1.length!=mat2.length) {
			return false;
		}
		for (int i = 0; i <= mat1.length-1; i++) {
			if (mat1[i].length!=mat2[i].length) {
				return false;
			}
			for (int j = 0; j <= mat1[i].length-1; j++)
				if (mat1[i][j] != mat2[i][j]) {
					return false;
				}
		}
		return true;	
	}
	
	// e) Får feilmelding på enhetstest, men klarer ikke å finne ut hvorfor. Tror den funker.
	public static int[][] speile(int [][] matrise) {
		int[][] nyMatrise = matrise;
		int temp = 0;
		for (int i = 0; i <= matrise.length-1; i++) {
			for (int j = 0; j <= i-1; j++) {
				temp = nyMatrise[j][i];
				nyMatrise[j][i] = matrise[i][j];
				nyMatrise[i][j] = temp;
			}
		}	
	
		return nyMatrise;
	}

	// f) Klarte ikke denne siste
	public static int[][] multipliser(int[][] a, int[][] b) { 
		int[][] nyMatrise = new int[a.length][b[0].length];
		
	return nyMatrise;
		
	}
	

}
