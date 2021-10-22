package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.GoOutException;
import exception.IdentificationException;

class InfoPersonTest {

	 private InfoPerson pruebaTest;
	
	
	public void setupScenary1() {
		pruebaTest = new InfoPerson();
	}
	
	@Test
	public void testEnter() {
		setupScenary1();
		
		String id="CC";
		String numId="222222222223";
		Person n= new Person(id,numId);
		
		try {
			boolean s=pruebaTest.valideOut(numId);
			pruebaTest.addPersonToList(id, numId);
			
			assertEquals(pruebaTest.getList().size(), 1);
			assertEquals(s, true);
		} catch (IdentificationException | GoOutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Test
	public void noEntraPorDocumento()  {
		setupScenary1();
		String numId="222222222222";
		
		String noEntra="TI";
		try {
			pruebaTest.addPersonToList(noEntra, numId);
			assertEquals(pruebaTest.getList().size(), 0);
		} catch (IdentificationException | GoOutException e) {
			e.printStackTrace();
		} 
		
	}
	

	@Test
	public void noEntraPorDia() {
		setupScenary1();
		
		String numId="2222222222225";  
		String id="CC";
		Person n= new Person(id,numId);
		
		try {
			boolean s=pruebaTest.valideOut(numId);
			pruebaTest.addPersonToList(id, numId);
			
			assertEquals(pruebaTest.getList().size(), 0);
		} catch (IdentificationException | GoOutException e) {
			e.printStackTrace();
		}
		
	}
}
