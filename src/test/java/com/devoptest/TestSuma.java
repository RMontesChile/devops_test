package com.devoptest;

import junit.framework.TestCase;

public class TestSuma extends TestCase{
	
	protected void setUp() throws Exception {
	      super.setUp();
	   }

	   protected void tearDown() throws Exception {
	      super.tearDown();
	   }

	   public final void testGetSuma() {
		   Suma suma = new Suma();
		   double resultado = suma.getSuma(1.0, 1.0);
		   assertEquals(2.0, resultado);
	   }

	   public final void testIncrementa() {
	      fail("Not yet implemented"); // TODO
	   }

}
