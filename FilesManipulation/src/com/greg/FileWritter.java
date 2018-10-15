package com.greg;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileWriter fw = new FileWriter("MonFW.txt");
			//Si le fichier n'existe pas, il sera crée automatiquement
			
			
			fw.write("Bonsoir");
			
			
			fw.close();//ferme le flot
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
