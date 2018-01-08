//Author: Peter Adamson, done using a framework provided by Eltaher El-Shanta

import java.util.ArrayList;

public class CarBinarySearch {
    
    public int[] Perform_Binary_Search(ArrayList<ACar> arrayToSearch, String serialNo, boolean searchByCarSerialNo)
    {
        int min = 0, max = arrayToSearch.size() - 1, mid = 0, NoC = 0;
        boolean found = false;
        Engine engine;
        
        int[] resultArray = new int[2];
        
        while (!found && min <= max) {
            
            mid = (min + max) / 2;
            
            if (searchByCarSerialNo)
            {
                // Compare car serial numbers.
                if (arrayToSearch.get(mid).getCarSerialNo().compareToIgnoreCase(serialNo) == 0)
                    found = true;
                else if (arrayToSearch.get(mid).getCarSerialNo().compareToIgnoreCase(serialNo) > 0)
                    max = mid - 1;
                else
                    min = mid + 1;
            }
            else
            {
                engine = (Engine) arrayToSearch.get(mid).getEngine();
                
                // Compare engine serial numbers.
                if (engine.getEngineSerialNo().compareToIgnoreCase(serialNo) == 0)
                    found = true;
                else if (engine.getEngineSerialNo().compareToIgnoreCase(serialNo) > 0)
                    max = mid - 1;
                else
                    min = mid + 1;
            }
            
            NoC++;
        }
        
        resultArray[0] = NoC;
        
        if (found)
            resultArray[1] = mid;
        else
            resultArray[1] = -1;
        
        return resultArray;
    }
    
}
