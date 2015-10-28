package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void menor() {
		//fail("Not yet implemented");
		assertEquals(5, Array.menor(new int []{5,7,10,14})) ;
		assertEquals(3, Array.menor(new int []{5,7,3,14})) ;
		assertEquals(3, Array.menor(new int []{5,7,15,3})) ;
	}

	@Test
	public void puesto() {
		//fail("Not yet implemented");
		assertEquals(3, Array.puesto(new int []{5,7,10,14}, 14)) ;
		assertEquals(1, Array.puesto(new int []{5,7,10,14}, 7)) ;

	}
	@Test//el array no tiene nada
	public void puesto_vacio() {
		//fail("Not yet implemented");
		assertEquals(-1, Array.puesto(new int []{}, 14)) ;
	}
}