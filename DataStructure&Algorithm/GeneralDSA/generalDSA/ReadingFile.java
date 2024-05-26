package generalDSA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException {
		try (//reading text from user 
		Scanner scRead = new Scanner(System.in)) {
			System.out.println("Enter word to be searched in file.");
			String word = scRead.next();
			
			//Reading data from file
			int count=0;
			Scanner scReadFileData= new Scanner(new File("D:\\DSA\\DataStructure&Algorithm\\src\\com\\dsa\\file.txt"));
			while(scReadFileData.hasNext())
			{
				if(scReadFileData.next().indexOf(word)!=-1)
				{
					count++;
				}
			}
			System.out.println("count of word "+word+ " is "+count);
			scReadFileData.close();
		}

	}

}
