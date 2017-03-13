package by.htp.maven;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MainPlay {
	public static Set<String> cities;

    public static void main (String[] args) {
 
        Reader.readCities();
    	cities = Reader.citiesList;
    	//System.out.println(cities);
    	System.out.println(cities.size());
    	
    	String letter = "first";
        Scanner sc = new Scanner(System.in);
        while (true) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Enter the city: ");
                String city = sc.nextLine();
                if (isCity(city, letter, cities)) {
                    letter = computerCity(lastChar(city),cities);
                    if (letter == null) {
                        System.out.println("Computer's game is over!");
                        return;
                    } else {
                        break;
                    }
                }
                if (i == 3) {
                    System.out.println("You game is over!");
                    return;
                }
            }
        }
    }


    public static String lastChar(String s1){
        int index = s1.length();
        String lastChar= s1.substring(index-1);
        if ((lastChar =="ь") || (lastChar=="ъ" )) {
            lastChar = s1.substring(index-2);
        }
        return lastChar.toUpperCase();
    }

    public static String firstChar(String s1) {
        String firstChar= s1.substring(0, 1);
        return firstChar;
    }

    public static boolean isCity(String city, String letter, Set<String> cities) {
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String cityList = it.next();
            if (city.equals(cityList)) {
                if (letter.equals("first") || letter.equals(firstChar(city))) {
                    System.out.println(city + " is accepted");
                    cities.remove(city);
                    return true;
                }
            }
        }
        System.out.println("Does not exist or it was named!");
        return false;
    }

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
    }
}