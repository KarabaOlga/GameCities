package by.htp.maven;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class IsCityTest {
	
	@Test
	public void testTrueIsCity() {
		
		Set<String> citiesTest=new HashSet<String>();
		citiesTest.add("Анапа");
		citiesTest.add("Могилев");
		citiesTest.add("Витебск");
		citiesTest.add("Киев");
		citiesTest.add("Минск");
		citiesTest.add("Архангельск");	
     String city = "Минск";
     String letter ="М";
	
	assertTrue(MainPlay.isCity(city, letter, citiesTest));
	}
	
	@Test
	public void testFalseIsCity() {
		
		Set<String> cities=new HashSet<String>();
		cities.add("Анапа");
		cities.add("Могилев");
		cities.add("Витебск");
		cities.add("Киев");
		cities.add("Минск");
		cities.add("Архангельск");
		
     String city = "Донецк";
     String letter ="O";
	
	assertFalse(MainPlay.isCity(city, letter, cities));
	}
	
	@Test
	public void testIsCityFirst() {
		
		Set<String> cities=new HashSet<String>();
		cities.add("Анапа");
		cities.add("Могилев");
		cities.add("Витебск");
		cities.add("Киев");
		cities.add("Минск");
		cities.add("Архангельск");
		
     String city = "Минск";
     String letter ="first";
	
	assertTrue(MainPlay.isCity(city, letter, cities));
	}
	
	
}
