package by.htp.maven;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import java.util.Set;

public class Reader {
	
	public static Set<String> citiesList;
	
	
    public static void readCities() {
        BufferedReader in;
        String s;      
        citiesList = new  HashSet<String>();
        try {
            in = new BufferedReader(new FileReader("src/main/resources/citiesList.txt"));
            while ((s = in.readLine()) != null) {
            	for(String str: s.split("\\s+")) {
                    citiesList.add(str);
                }
            }
            in.close();
            System.out.println(citiesList.size());
            
        } catch(FileNotFoundException e) {
        	e.printStackTrace();
        } catch (IOException e){
        	e.printStackTrace();;
        }

    }
}

