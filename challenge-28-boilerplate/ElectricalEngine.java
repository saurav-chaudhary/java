public class ElectricalEngine extends Engine{
    int voltage;
    String currentType;
    public ElectricalEngine(String model)
    {
        this.model=model;
        this.maxPower=88;
        this.maxRpm=15000;
        this.maxTorque=220;
        this.weight=45;
        this.voltage=360;
        this.currentType="AC";
    }
    public void showSpecs()
     {
        System.out.println(" Engine Type         : 	    Electric Engine	");
       
        System.out.println(" Engine Model Number :"	+model);
        System.out.println();
        System.out.println("**Key Specifications:**");
        System.out.println();
        
        System.out.println("Max Power     :"+" "+maxPower);
        System.out.println("Max Rpm       :"+" "+maxRpm);
        System.out.println("Max Torque    :"+" "+maxTorque);
        System.out.println("Weight        :"+" "+weight);
        System.out.println("Voltage       :"+" "+voltage);
        System.out.println("Current Type  :"+" "+currentType);
        
       
     }
}
