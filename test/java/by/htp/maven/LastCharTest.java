package by.htp.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastCharTest {

	@Test
	public void testLastCharCreated1() {	
	  String s1 = "Минск";
	  assertEquals("К",MainPlay.lastChar(s1));
	}
    
	@Test
	public void testLastCharCreated2() {
		String s2 = "Сморгонь";
		assertEquals("Н",MainPlay.lastChar(s2));
	}
	
	@Test
	public void testLastCharCreated3() {
		String s3 = "Вормъ";
		assertEquals("М",MainPlay.lastChar(s3));
	}

}