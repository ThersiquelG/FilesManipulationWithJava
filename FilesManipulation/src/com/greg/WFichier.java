package com.greg;

import java.io.FileWriter;
import java.io.IOException;
import com.greg.Client;

public class WFichier {
	public static void ecrire(Client[] myClients, String MyFile) {
		
		try {
			FileWriter fw1 = new FileWriter(MyFile);
			
			//Pour chaque instance Client : collection array
			for(Client bruno : myClients) {
				
				
			fw1.write(bruno.toString());
			
			
			}
			fw1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filedir = "MyFile.txt";
		
		String cl1nom = "Bob";
		String cl1prenom = "Morane";
		String cl1ref = "12";
		
		Client cl1 = new Client(cl1nom,cl1prenom,cl1ref);
		Client cl2 = new Client("zoe", "duchard", "3");
		Client cl3 = new Client("maxime", "dupont", "E");
		cl1.toString();
		System.out.println(cl1);
		
		
		Client[] clientArray = new Client[3];
		clientArray[0] = cl1;
		clientArray[1] = cl2;
		clientArray[2] = cl3;
		
		ecrire(clientArray,filedir);
		
		
		
		
		
		
	}

}
