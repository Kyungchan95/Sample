package ch18.check;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "C:/Users/Jang/Desktop/JavaProgramming/src/ch18/check/test.txt";

		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);

		int rowNumber = 0;
		String rowData;
		while ((rowData = br.readLine()) != null) {
			System.out.println(++rowNumber + " : " + rowData);

		}
		br.close();
		fr.close();

	}

}
