public class DCT extends Automatic{
    double seventhGearRatio;
    double eightGearRatio;
    
        public DCT(String model)
        {
        this.model=model;
            this.forwardGearRatio=4;
            this.firstGearRatio=2.54;
            this.secondGearRatio=1.920;
            this.thirdGearRatio=1.510;
            this.forthGearRatio=1.000;
            this.fifthGearRatio=1.285;
            this.sixthGearRatio=1.000;
            this.seventhGearRatio=0.839;
            this.eightGearRatio=0.667;
        }
        public void showSpecs()
        {
            System.out.println(" Transmission Type: 			Automated DCT	");
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
            System.out.println("7 Gear Ratio:"+" "+seventhGearRatio);
            System.out.println("8 Gear Ratio:"+" "+eightGearRatio);
            
        }

        
}
