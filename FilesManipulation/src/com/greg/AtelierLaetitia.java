package com.greg;

import java.io.File;
import java.io.IOException;

public class AtelierLaetitia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nouvelle instance de File
		File f = new File("/home/simplon/git/FilesManipulationWithJava/FilesManipulation/MonFic.txt");
		
		//Vérifier si le fichier existe	
		boolean bool ;
		
		try {
			bool = f.createNewFile();
			if(bool == false) {
				System.out.println("Le fichier n'a pas été crée/existe déjà.");
				
			} else {
				System.out.println("Le fichier est bien présent dans le répertoire du projet.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Créer un nouveau répertoire
		File rep = new File("/home/simplon/git/FilesManipulationWithJava/FilesManipulation/monRepoLaetis");
		boolean bool2 =rep.mkdir();
		
		if(bool2 == false) {
			System.out.println("Le répertoire n'a pas été crée ou existe déjà. : " + rep.getAbsolutePath());
		} else {
			
			System.out.println("Le répertoire a bien été crée au chemin suivant : " +  rep.getAbsolutePath());
		}
		
		
		//One way to move a file 
		f.renameTo(new File("/home/simplon/git/FilesManipulationWithJava/FilesManipulation/monRepoLaetis/MonFic.txt"));
		File filetoDelete = new File("/home/simplon/git/FilesManipulationWithJava/FilesManipulation/monRepoLaetis/MonFic.txt");
		filetoDelete.delete();
		
		File repproject = new File("/home/simplon/git/FilesManipulationWithJava/FilesManipulation");
		if(repproject.isDirectory()) {
			String[] contenudurep = repproject.list();
			for(int i = 0; i< contenudurep.length; i++) {
				System.out.println(contenudurep[i]);
			}
		}
		
		
		
			
		
		
		

	}

}
