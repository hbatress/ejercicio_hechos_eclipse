package listaEnlazadaSimple;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitHelloWorldTest {
	
	private static JUnitHelloWorld helloWorld;
		
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Antes de todas");
		helloWorld = new JUnitHelloWorld();
	}
	
	@Before
	public void before() {
		System.out.println("Antes de cada una");
	}
	
	@Test
	public void isGreaterTest() {
		System.out.println("La Prueba");
		assertTrue("Num 4 no es mayor que Num 3", helloWorld.isGreater(4, 3));
	}
	
	@After
	public void after() {
		System.out.println("Despues de cada una");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Despues de todas");
	}
}
