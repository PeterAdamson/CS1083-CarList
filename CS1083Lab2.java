//Author: Peter Adamson, done using a framework provided by Eltaher El-Shanta

import java.util.Scanner;
import java.util.ArrayList;

public class CS1083Lab2 {

    public static void main(String[] args) {

	try{
		Scanner scan = new Scanner(System.in);
		char more = 'y';
		String tempCarSerialNo, tempModel;
		int tempYear, tempNoP;
		String tempEngineSerialNo;
		int tempHorsePower;
		boolean tempHybrid = false;
		char tempAnswer;

		ArrayList<ACar> car = new ArrayList<ACar>();

		while(more == 'y' || more == 'Y'){
			System.out.println("Please enter the car serial number: ");
			tempCarSerialNo = scan.nextLine();
			System.out.println("Please enter the car model: ");
			tempModel = scan.nextLine();
			System.out.println("Please enter the year of the car: ");
			tempYear = scan.nextInt();
			System.out.println("Please enter the number of owners of the car: ");
			tempNoP = scan.nextInt();
			scan.nextLine();
			System.out.println("Please enter the engine serial number: ");
			tempEngineSerialNo = scan.nextLine();
			System.out.println("Please enter the engine horsepower: ");
			tempHorsePower = scan.nextInt();
			scan.nextLine();
			System.out.println("Is the engine a hybrid? (y/n)");
			tempAnswer = scan.nextLine().charAt(0);
			if(tempAnswer == 'y'){
				tempHybrid = true;
			}
			car.add(new ACar(tempCarSerialNo, tempModel, tempYear, tempNoP, new Engine(tempEngineSerialNo, tempHorsePower, tempHybrid)));
			System.out.println("Would you like to enter another car? (y/n)");
			more = scan.nextLine().charAt(0);
		}
		
		String serialNo = "";
		int[] resultArray;
		
		CarInsertionSort carInsSort = new CarInsertionSort();
		CarBinarySearch carBinSearch = new CarBinarySearch();
		
		System.out.println();
		System.out.println("These are the contents of car list BEFORE sorting...");
		System.out.println();
		Print(car);
		System.out.println();

		// Sorting car array based on car serial number and then
		// searching for a car object using car serial number.
		System.out.println("These are the contents of car list AFTER sorting based on 'CAR serial no.'...");
		System.out.println();
		carInsSort.Perform_Insertion_Sort(car, true);
		Print(car);
		System.out.println();          
		
		while (serialNo.compareToIgnoreCase("x") != 0)
		{
		    System.out.println();
		    System.out.print("Enter car serial no to search for or x to exit: ");
		    serialNo = scan.nextLine();
	       
		    if (serialNo.compareToIgnoreCase("x") != 0)
		    {
		        resultArray = carBinSearch.Perform_Binary_Search(car, serialNo, true);
		
		        System.out.println();
		        if (resultArray[1] == -1)
		            System.out.println("The car is not found in the list");
		        else
		        {
		            System.out.println(car.get(resultArray[1]).toString());   
		            System.out.println();
		            System.out.println("The car is located at position (" + (resultArray[1] + 1) + ").");
		        }
		        
		        System.out.println("The number of comparisons performed is :" + resultArray[0]);
		    }
		}
		    
		// Sorting car array based on engine serial number and then
		// searching for a car object using engine serial number.
		System.out.println();
		System.out.println("These are the contents of car list AFTER sorting based on 'ENGINE serial no.'...");
		System.out.println();
		carInsSort.Perform_Insertion_Sort(car, false);
		Print(car);
		System.out.println();           
		
		serialNo = "";
		while (serialNo.compareToIgnoreCase("x") != 0)
		{
		    System.out.println();
		    System.out.print("Enter engine serial no to search for or x to exit: ");
		    serialNo = scan.nextLine();
	       
		    if (serialNo.compareToIgnoreCase("x") != 0)
		    {
		       resultArray = carBinSearch.Perform_Binary_Search(car, serialNo, false);
		
		        System.out.println();
		        if (resultArray[1] == -1)
		            System.out.println("The car is not found in the list");
		        else
		        {
		            System.out.println(car.get(resultArray[1]).toString());   
		            System.out.println();
		            System.out.println("The car is located at position (" + (resultArray[1] + 1) + ").");
		        }

		        System.out.println("The number of comparisons performed is :" + resultArray[0]);
		    }            
		}
	
	}

		catch(Exception exp){
		System.out.println("An exception occurred!\n\n" + exp);
		}	        
	}
    

    public static void Print(ArrayList<ACar> car)
    {
        System.out.println("Car S.N.\tCar Model\tYear\tNoP\t"+
                            "Engine S.N.\t Horse Power\tHybrid");
        System.out.println("-------------------------------------------------" +
                            "------------------------------------");        
        for (int i = 0; i < car.size(); i++)
            System.out.println(car.get(i).toString());
    }
    
}
