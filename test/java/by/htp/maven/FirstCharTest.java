package by.htp.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstCharTest {

	@Test
	public void testFirstCharCreated1() {
		String s1 = "Анапа";
		assertEquals("А",MainPlay.firstChar(s1));
	}
    
	@Test
	public void testFirstCharCreated2() {
		String s2 = "Могилев";
		assertEquals("М",MainPlay.firstChar(s2));
	}
}
