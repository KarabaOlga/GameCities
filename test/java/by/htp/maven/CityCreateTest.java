package by.htp.maven;

import static org.junit.Assert.*;

import java.util.Set;
import org.junit.Test;

public class CityCreateTest {

	@Test
	public void testCityCreated() {
		Set<String> cities;
		Reader.readCities();
		cities = Reader.citiesList;
    	assertNotNull(cities);
	}
}
