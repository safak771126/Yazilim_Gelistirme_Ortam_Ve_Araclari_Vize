package tr.edu.medipol.yazilimaraclari.safaksezer;

public class MuhasebeProgrami {

	public static void main(String[] args) {
		System.out.print(ucretHesapla(10,2)); 
	}
	
	public static int ucretHesapla(int calisilanSaat, int saatlikUcret) {
		return calisilanSaat*saatlikUcret;
	}
}
