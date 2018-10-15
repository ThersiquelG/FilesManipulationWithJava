package com.greg;

import java.io.File;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objet d'un fichier déjà existant "monFile.txt"
		File f = new File("monFile.txt");
		
		
		//objet du répertoire "Monrepo" dans un chemin relatif au projet
		File rep = new File("Monrepo");
		
		//création du répertoir 
		rep.mkdir();
		
		if(rep.isDirectory()) {
			String[] contenuRep = rep.list();
			for(int i = 0 ; i < contenuRep.length ; i++) {
				System.out.println(contenuRep[i]);
			}
		}
		
		System.out.println(rep.getAbsolutePath());
		
		boolean delete = f.delete();
	}

}
