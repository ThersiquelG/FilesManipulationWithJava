package com.greg;

import java.io.FileWriter;
import java.io.IOException;

public class AppBruno {
	public AppBruno() {

	}

	public static void ecrire(ClientAtBruno[] clients, String fichier)throws IOException{
		FileWriter fw = new FileWriter(fichier);
		for(ClientAtBruno objecClient : clients) {
			fw.write(objecClient.toString());
		}
		fw.close();
	}
}
