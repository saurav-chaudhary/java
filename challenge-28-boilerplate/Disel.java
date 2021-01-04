public class Disel extends Combustion {
    public Disel(String model)
    {
        this.model=model;
        if(model =="D1300")
        {
            this.maxPower=67;
            this.maxRpm=6000;   
            this.maxTorque=200;
            this.displacement=1248;
            this.cylinders=4;
            this.compRatio="17.6:1";
            this.weight=111;
        }
       else if(model =="D1800")
        {
            this.maxPower=103;
            this.maxRpm=6300;   
            this.maxTorque=170;
            this.displacement=1796;
            this.cylinders=4;
            this.compRatio="10.5:1";
            this.weight=141;
        }
        else if(model =="D2400")
        {
            this.maxPower=136;
            this.maxRpm=7000;   
            this.maxTorque=233;
            this.displacement=2384;
            this.cylinders=4;
            this.compRatio="11.2:1";
            this.weight=152;
        }
    }
    public void showSpecs()
     {
        System.out.println(" Engine Type         : 	    Internal Combustion	");
        System.out.println(" Engine Power Source :		Disel");
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
