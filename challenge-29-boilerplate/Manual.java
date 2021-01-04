public class Manual extends Transmission {
    double fifthGearRatio;
    double sixthGearRatio;
    public Manual(String model)
    {
        this.model=model;
        if(model =="MP4")
        {
            this.forwardGearRatio=4;
            this.firstGearRatio=2.54;
            this.secondGearRatio=1.920;
            this.thirdGearRatio=1.510;
            this.forthGearRatio=1.000;

        }
        else if(model =="MP5")
        {
            this.forwardGearRatio=5;
            this.firstGearRatio=3.545;
            this.secondGearRatio=1.904;
            this.thirdGearRatio=1.280;
            this.forthGearRatio=0.914;
            this.fifthGearRatio=0.757;
        }
        else if(model=="MP6")
        {
            this.forwardGearRatio=6;
            this.firstGearRatio=3.010;
            this.secondGearRatio=2.070;
            this.thirdGearRatio=1.430;
            this.forthGearRatio=1.000;
            this.fifthGearRatio=0.710;
            this.sixthGearRatio=0.570;
        }
        else if(model == "MD5")
        {
            this.forwardGearRatio=5;
            this.firstGearRatio=3.545;
            this.secondGearRatio=1.904;
            this.thirdGearRatio=1.233;
            this.forthGearRatio=0.911;
            this.fifthGearRatio=0.725;
        }
        else if(model=="MD6")
        {
            this.forwardGearRatio=6;
            this.firstGearRatio=3.640;
            this.secondGearRatio=2.150;
            this.thirdGearRatio=1.360;
            this.forthGearRatio=1.000;
            this.fifthGearRatio=0.750;
            this.sixthGearRatio=0.630;
        }
    }
    public void showSpecs()
    {
        System.out.println(" Transmission Type: 			Manual	");
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
