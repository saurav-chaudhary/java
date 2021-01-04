public class Petrol extends Combustion
 {
    
     public Petrol(String model)
     {  
        this.model =model;
        if(model == "P1000")
        {
         this.maxPower=50;
         this.maxRpm=6000;
         this.maxTorque=90;
         this.displacement=996;
         this.cylinders=3;
         this.compRatio="11.0:1";
         this.weight=75;
        }
        else if(model == "P1500")
        {
         this.maxPower=88;
         this.maxRpm=6500;
         this.maxTorque=155;
         this.displacement=1498;
         this.cylinders=4;
         this.compRatio="10.3:1";
         this.weight=93;
        }
         else if(model == "P2000")
        {
         this.maxPower=118;
         this.maxRpm=6500;
         this.maxTorque=220;
         this.displacement=1992;
         this.cylinders=4;
         this.compRatio="12.0:1";
         this.weight=125;
        }
        else if(model == "P2000")
        {
         this.maxPower=118;
         this.maxRpm=6500;
         this.maxTorque=220;
         this.displacement=1992;
         this.cylinders=4;
         this.compRatio="12.0:1";
         this.weight=125;
        }
        else if(model == "P2400")
        {
         this.maxPower=138;
         this.maxRpm=6900;
         this.maxTorque=340;
         this.displacement=2396;
         this.cylinders=6;
         this.compRatio="10.5:1";
         this.weight=140;
        }
        
     }
     public void showSpecs()
     {
        System.out.println(" Engine Type         : 	    Internal Combustion	");
        System.out.println(" Engine Power Source :		Petrol");
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
    

