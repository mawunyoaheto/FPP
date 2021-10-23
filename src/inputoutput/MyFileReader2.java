package inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileReader2 {

	public static void main(String[] args) {

		MyFileReader2 read = new MyFileReader2();
		try {
			read.readFile();
			read.writeTextToFile("Writting from Java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void readFile() throws IOException {
		try {

			FileReader reader = new FileReader("text.txt");

			BufferedReader bf = new BufferedReader(reader);

			String line = null;

			while ((line = bf.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
			bf.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}


	void writeTextToFile(String str) throws IOException {

		try {

			FileWriter fw = new FileWriter("text2.txt");
			PrintWriter pw = new PrintWriter(fw);

			pw.println(str);
			fw.close();
			pw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
