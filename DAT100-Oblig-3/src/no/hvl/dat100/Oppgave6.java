package no.hvl.dat100;

public class Oppgave6 {

	public static void skrivUt (int[] tabell) {
		
		for(int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
		}	
	}
	
	
	public static String tilStreng (int[] tabell) {
		String utTxt = "[";
		for(int i = 0; i < tabell.length-1; i++) {
			utTxt += tabell[i] + ",";
		}
		utTxt += tabell[tabell.length-1];
		utTxt += "]";
		return utTxt;	
		
		}

	
	public static int summerA (int[] tabell) {
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum+=tabell[i];
			
		}
		return sum;
	}
	
	public static int summerB (int[] tabell) {
		int sum = 0;
		int i = 0;
		while(i < tabell.length) {
			sum+=tabell[i];
			i++;
		}
		return sum;	
	}
	
	public static int summerC (int[] tabell) {
		int sum = 0;
		for (int tall: tabell) {
			sum += tall;
		}
		
		return sum;	
		
	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean finnes = false;
			for(int i = 0; i < tabell.length; i++) {
				if(tall == tabell[i]) {
					finnes = true;
				}
			}
		return finnes;
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				return i;
			} 
			}
		return -1;
	}
	
	public static int[] reverser(int[] tabell) {
		int [] returtabell = new int[tabell.length];
		for(int i = 0; i < tabell.length; i++) {
			returtabell [tabell.length - 1 - i] = tabell [i];
		}
		return returtabell;
	}
	
	public static boolean erSortert (int[] tabell) {
		for(int i = 0; i < tabell.length-1; i++) {
			if(tabell[i] < tabell[i+1]) {
				return false;
			}
		} 
		
		return true;
	}
	
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int[] returtabell = new int [tabell1.length+tabell2.length];
		for(int i = 0; i < tabell1.length; i++) {
			returtabell[i] = tabell1 [i];
		}
		for(int i = 0; i < tabell2.length; i++) {
			returtabell[i+tabell1.length] = tabell2 [i];
		}
	return returtabell;
	}
}
	
	
	
	
	

	




