package com.greg;

import java.io.IOException;

public class ApplicationBruno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientAtBruno cl1 = new ClientAtBruno("Morane","Bob",12);
		ClientAtBruno cl2 = new ClientAtBruno("Bruce", "Wayne", 3);
		ClientAtBruno cl3 = new ClientAtBruno("Corbene", "Wallas", 18);
		ClientAtBruno [] clients = new ClientAtBruno[3];
		
		clients[0] = cl1;
		clients[1] = cl2;
		clients[2] = cl3;
		
		
		try {
			AppBruno.ecrire(clients, "FichierClients.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
