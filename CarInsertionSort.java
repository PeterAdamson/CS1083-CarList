//Author: Peter Adamson, done using a framework provided by Eltaher El-Shanta

import java.util.ArrayList;

public class CarInsertionSort {
    
    public void Perform_Insertion_Sort(ArrayList<ACar> arrayToSort, boolean searchByCarSerialNo)
    {
        int i, j;
        ACar temp;

        for (i = 1; i < arrayToSort.size(); i++)
        {
            temp = arrayToSort.get(i);
                
            if (searchByCarSerialNo)
            {
                for (j = i; j > 0 && temp.compareToIgnoreCase(arrayToSort.get(j-1)) < 0; j--)
                     arrayToSort.set(j, arrayToSort.get(j-1));
            }
            else
            {
                for (j = i; j > 0 && temp.getEngine().
                        compareToIgnoreCase(arrayToSort.get(j-1).getEngine()) < 0; j--)
                     arrayToSort.set(j, arrayToSort.get(j-1));
            }
            
            arrayToSort.set(j, temp);
        }

    }
}
