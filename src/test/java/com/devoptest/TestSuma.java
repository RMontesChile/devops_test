package com.devoptest;

import junit.framework.TestCase;

public class TestSuma extends TestCase{
	
	protected void setUp() throws Exception {
	      super.setUp();
	   }

	   protected void tearDown() throws Exception {
	      super.tearDown();
	   }

	   public final void testGetSuma1() {
		   Suma suma = new Suma();
		   double resultado = suma.getSuma(1.0, 1.0);
		   assertEquals(2.0, resultado);
	   }

	   public final void testGetSuma2() {
		   Suma suma = new Suma();
		   double resultado = suma.getSuma(1.0, 2.0);
		   assertEquals(3.0, resultado);
	   }
	   public final void testGetSuma3() {
		   Suma suma = new Suma();
		   double resultado = suma.getSuma(1.0, 3.0);
		   assertEquals(4.0, resultado);
	   }
	   public final void testGetSuma4() {
		   Suma suma = new Suma();
		   double resultado = suma.getSuma(1.0, 4.0);
		   assertEquals(5.0, resultado);
	   }
	   public final void testGetSuma5() {
		   Suma suma = new Suma();
		   double resultado = suma.getSuma(1.0, 5.0);
		   assertEquals(6.0, resultado);
	   }

}
