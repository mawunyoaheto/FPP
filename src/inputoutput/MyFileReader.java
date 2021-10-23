package inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	static BufferedReader bf;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("text.txt");

		try {

			bf = new BufferedReader(new FileReader(file));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String st;
		try {
			while ((st = bf.readLine()) != null) {
				System.out.println(st);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
