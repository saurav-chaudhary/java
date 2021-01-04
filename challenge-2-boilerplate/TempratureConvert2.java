import java.lang.Math;
class TempratureConvert2
{
    public static void main(String[] args)
    {
        System.out.printf("%s  %20s %20s \n","Sr. No "," Temperature(Celsius) "," Temperature(Celsius) " );
        double tf = 0;

      for(int i=0; i<=100; i+=10)
      {
        
         int sr = (i/10)+1;
          tf = ((i*1.8)+ 32);
         // int fran=(int)tf;
          System.out.printf("%d  %20d %20s \n",sr,i,tf );
      }
    }
}