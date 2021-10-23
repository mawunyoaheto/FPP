package inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSearch {

	@SuppressWarnings("resource")
	public boolean searchForFile(String fileName, String startDir) throws FileNotFoundException {
		File dir = new File(startDir);
		File[] files = dir.listFiles();
		BufferedReader bf;

		if (files != null && files.length > 0) {
			for (File file : files) {

				System.out.println("File name: " + file.getName());
				System.out.println("File path: " + file.getAbsolutePath());
				System.out.println("Size :" + file.getTotalSpace());

				// base case
				if (file.isFile() && file.getName().equals(fileName)) {

					try {
						String st;
						bf = new BufferedReader(new FileReader(file));

						while ((st = bf.readLine()) != null) {
							System.out.println(st);
						}

						return true;

					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				// Check if the file is a directory
				if (file.isDirectory()) {

					searchForFile(fileName, file.getAbsolutePath());
				}

			}
		}

		return false;
	}

	public static void main(String[] args) {
		FileSearch test = new FileSearch();
		String startDir = ("D:/Test-search");
		try {
			System.out.println(test.searchForFile("text.txt1", startDir));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
