public class Maths{
  
  public static void main(String[] args){
   double base = 2.0;
   double exponent = 0.5;
   //This gets sqrt of two
   double root= Math.sqrt(base);
   System.out.println(root);
   //This gets the third root of 2
   double thirdRoot = Math.pow(2.,1/3.);
   System.out.println(thirdRoot);
   thirdRoot = Math.pow(200.,1/3.);
   System.out.println(thirdRoot);
   double floor = Math.floor(thirdRoot);
   double ceiling = Math.ceil(thirdRoot);
   System.out.println(floor);
   System.out.println(ceiling);
   System.out.println(Math.floor(-5.3));
   System.out.println(Math.random());
  }
}