import java.lang.Math;
class TempratureConversion
{
    public static void main(String[] args)
    {
        System.out.printf("%s  %20s %20s \n","Sr. No "," Temperature(Celsius) "," Temperature(Celsius) " );
        int tf = 0;

      for(int i=0; i<=100; i+=10)
      {
        
         int sr = (i/10)+1;
          tf = (int)(Math.ceil((i*1.8)+ 32));
         // int fran=(int)tf;
          System.out.printf("%d  %20d %20d \n",sr,i,tf );
      }
    }
}