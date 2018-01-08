//Author: Peter Adamson, done using a framework provided by Eltaher El-Shanta

public class Engine {
    
    private String engineSerialNo;
    private int horsePower;
    private boolean hybrid;
    
    public Engine(String engineSerialNo, int horsePower, boolean hybrid)
    {
        this.engineSerialNo = engineSerialNo;
        this.horsePower = horsePower;
        this.hybrid = hybrid;
    }
    
    
    public int compareToIgnoreCase(Engine engine)
    {
        return this.engineSerialNo.compareToIgnoreCase(engine.getEngineSerialNo());
    }

    public int compareToIgnoreCase(String engineSerialNo1, String engineSerialNo2)
    {
        return engineSerialNo1.compareToIgnoreCase(engineSerialNo2);
    }
    
    public String getEngineSerialNo()
    {
        return engineSerialNo;
    }
    
    public String toString()
    {
        return engineSerialNo + "\t\t" + horsePower + "\t"+
                hybrid;
    }
}
