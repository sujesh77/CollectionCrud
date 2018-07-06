package org.itglance.collectioncrud.collectionCRUD;

import static org.junit.Assert.*;

import org.itglance.collectioncrud.dao.Calculator;
import org.junit.Test;

public class TestCalc {

	Calculator calc=new Calculator();
	
	@Test
	public void testAdd() {
	
		assertEquals(6,calc.add(2, 4));
		
	}

}
