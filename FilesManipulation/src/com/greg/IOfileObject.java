package com.greg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOfileObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("MonZoo.ser");
			
			//Intermédiaire pour communiquer avec le system ( ObjectOutputStream )
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject("Mon Chien");
			oos.writeObject("MonCanard");
			
			oos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
