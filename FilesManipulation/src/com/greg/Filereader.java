package com.greg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("FileRead.txt");
		
		FileReader fr;
		try {
			fr = new FileReader(f);
			
			BufferedReader bfr = new BufferedReader(fr);
			String ligne = null;
			
			
			//Pour chaque lignes lues non équivalentes à null, les print
			while((ligne = bfr.readLine()) != null) {
				System.out.println(ligne);
			} bfr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
