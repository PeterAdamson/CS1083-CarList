//Author Peter Adamson

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SorterDriver{

	public static void main(String[] args){
	
		try{
			Scanner scan = new Scanner(System.in);
			String inputFile = "", outputFile = "";	
			ArrayList<String> toSort = new ArrayList<String>();		

			if(args.length == 2){
				inputFile = args[0];
				outputFile = args[1];
			}
			
			else{
				System.out.println("You did not supply the correct number of arguments.");
			}

			Scanner fileIn = new Scanner(new File(inputFile));
			PrintWriter outPut = new PrintWriter(outputFile);

			while(fileIn.hasNextLine()){
				toSort.add(fileIn.nextLine());
			}

			Collections.sort(toSort, Collections.reverseOrder());

			for(int i = 0; i < toSort.size(); i++){
				outPut.println(toSort.get(i));
			}
			outPut.close();

		}

		catch(IOException ioexp){
			System.out.println("IO Exception was thrown!\n\n" + ioexp);
		}

		catch(Exception exp){
			System.out.println("Something went wrong while reading your arguments \n\n" + exp);
		}



	}
}
