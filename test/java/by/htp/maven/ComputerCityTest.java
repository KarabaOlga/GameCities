package by.htp.maven;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ComputerCityTest {

	/*
	  public static String computerCity(String letter, Set<String> cities ) {
        Iterator<String> it2 = cities.iterator();
        while (it2.hasNext()) {
            String city = it2.next();
            if (firstChar(city).equals(letter)) {
                cities.remove(city);
                System.out.println("Computer names " + city);
                return lastChar(city);
            }
        }
        return null;
	 */
	
	@Test
	public void testComputerCityCreated1() {
		
		Set<String> cities=new HashSet<String>();
		cities.add("Анапа");
		cities.add("Могилев");
		cities.add("Витебск");
	
     String letter ="М";
	
     assertEquals("В",MainPlay.computerCity(letter, cities));
	}
	
	@Test
	public void testComputerCityCreated2() {
		
		Set<String> cities=new HashSet<String>();
		cities.add("Анапа");
		cities.add("Могилев");
		cities.add("Витебск");
	
     String letter ="К";
	
     assertNull(MainPlay.computerCity(letter, cities));
	}


}
