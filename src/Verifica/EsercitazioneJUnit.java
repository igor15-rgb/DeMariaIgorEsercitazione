package Verifica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsercitazioneJUnit {
	// test di tipo float
	@Test
	void test1() {
		// fail("Not yet implemented");
		Trapezio t = new Trapezio();
		assertEquals(2.5, t.CalcArea(3, 2, 1));
	}

	// test di tipo float
	@Test
	void test2() {
		// fail("Not yet implemented");
		Trapezio t = new Trapezio();
		assertEquals(27.5, t.CalcArea(6, 5, 5));
	}

	// test di tipo float
	@Test
	void test3() {
		// fail("Not yet implemented");
		Trapezio t = new Trapezio();
		assertEquals(18.5, t.CalcArea(32, 5, 1));
	}

}
