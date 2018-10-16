package com.greg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppBruno {
	public AppBruno() {

	}

	public static void ecrire(ClientAtBruno[] clients, String fichier)throws IOException{
		FileWriter fw = new FileWriter(fichier);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		for(ClientAtBruno objecClient : clients) {
			//fw.write();
			bw.write(objecClient.toString());
		}
		bw.close();
	}
}
