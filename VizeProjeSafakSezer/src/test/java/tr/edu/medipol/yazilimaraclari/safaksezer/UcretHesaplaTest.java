package tr.edu.medipol.yazilimaraclari.safaksezer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class UcretHesaplaTest {
	
	@Test
	public void TestUcretHesapla() {
		
		int asilSonuc = MuhasebeProgrami.ucretHesapla(10, 2);
		Assert.assertEquals(20, asilSonuc);
	}

}
