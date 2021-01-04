public class AMT extends Transmission {
    double fifthGearRatio;
    public AMT(String model)
    {
        this.model=model;
        if(model =="AMTP4")
        {
            this.forwardGearRatio=4;
            this.firstGearRatio=2.540;
            this.secondGearRatio=1.920;
            this.thirdGearRatio=1.510;
            this.forthGearRatio=1.000;

        }
        else if(model =="AMTD5")
        {
            this.forwardGearRatio=5;
            this.firstGearRatio=2.950;
            this.secondGearRatio=1.940;
            this.thirdGearRatio=1.340;
            this.forthGearRatio=1.000;
            this.fifthGearRatio=0.630;
        }
    }
    public void showSpecs()
    {
        System.out.println(" Transmission Type: 			Automated Manual	");
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
    }
}
