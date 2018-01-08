//Author: Peter Adamson, done using a framework provided by Eltaher El-Shanta

public class ACar {
    
    private String carSerialNo, model;
    private int year, NOP;
    private Engine engine;
    
    public ACar(String carSerialNo, String model, int year, int NOP, Engine engine)
    {
        this.carSerialNo = carSerialNo;
        this.model = model;
        this.year = year;
        this.NOP = NOP;
        this.engine = engine;
    }
    
    public int compareToIgnoreCase(ACar car)
    {
        return this.carSerialNo.compareToIgnoreCase(car.getCarSerialNo());
    }

    public int compareToIgnoreCase(String carSerialNo1, String carSerialNo2)
    {
        return carSerialNo1.compareToIgnoreCase(carSerialNo2);
    }
    
    public String getCarSerialNo()
    {
        return carSerialNo;
    }
    
    public Engine getEngine()
    {
        return engine;
    }        
    
    public String toString()
    {
        return carSerialNo + "\t" + model + "\t" +
                year + "\t" + NOP + "\t" + engine.toString();
    }
    
    
}
