public class CVT extends Automatic {
    public CVT(String model)
    {
        this.model=model;
       
            this.forwardGearRatio=6;
            this.firstGearRatio=2.631;
            this.secondGearRatio=1.440;
            this.thirdGearRatio=1.165;
            this.forthGearRatio=0.906;
            this.fifthGearRatio=0.680;
            this.sixthGearRatio=0.499;
            

        
    }
    public void showSpecs()
    {
        System.out.println(" Transmission Type: 			Automated CVT	");
        System.out.println(" Transmission Model Number:		"+model);
        System.out.println();
        System.out.println("Key Specifications:");
        System.out.println();
        System.out.println("Forward Gear Ratio:"+" "+forwardGearRatio);
        System.out.println("1 Gear Ratio:"+" "+firstGearRatio);
        System.out.println("2 Gear Ratio:"+" "+secondGearRatio);
        System.out.println("3 Gear Ratio:"+" "+thirdGearRatio);
        System.out.println("4 Gear Ratio:"+" "+forthGearRatio);
        System.out.println("5 Gear Ratio:"+" "+fifthGearRatio);
        System.out.println("6 Gear Ratio:"+" "+sixthGearRatio);
        
    }
}

