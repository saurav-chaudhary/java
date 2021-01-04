public class CNG extends Combustion {
    public CNG(String model)
    {
        this.model=model;
        if(model=="C1000")
        {
            {
                this.maxPower=43;
                this.maxRpm=6000;   
                this.maxTorque=78;
                this.displacement=998;
                this.cylinders=3;
                this.compRatio="11.0:1";
                this.weight=75;
            }
        }
        else if(model=="C1000")
        {
            {
                this.maxPower=69;
                this.maxRpm=6500;   
                this.maxTorque=122;
                this.displacement=1498;
                this.cylinders=4;
                this.compRatio="10.5:1";
                this.weight=93;
            }
        }
    }
    public void showSpecs()
     {
        System.out.println(" Engine Type         : 	    Internal Combustion	");
        System.out.println(" Engine Power Source :		CNG");
        System.out.println(" Engine Model Number :"	+model);
        System.out.println();
        System.out.println("**Key Specifications:**");
        System.out.println();
        System.out.println("Displacement  :"+" "+displacement);
        System.out.println("Max Power     :"+" "+maxPower);
        System.out.println("Max Rpm       :"+" "+maxRpm);
        System.out.println("Max Torque    :"+" "+maxTorque);
        System.out.println("Weight        :"+" "+weight);
        System.out.println("Cylinders     :"+" "+cylinders);
        System.out.println("Comp Ratio    :"+" "+compRatio);
     }
}
