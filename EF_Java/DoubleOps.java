public class DoubleOps{
  
  public static void main (String[] args){
  double a,b;
  a=6; b=3;
  
  System.out.println("a="+a+" b="+b);
  System.out.println("a+b="+a+b);//NOT GOOD!!!!
  System.out.println("a+b="+(a+b));
  System.out.println("a-b="+(a-b));
  System.out.println("a*b="+(a*b));
  System.out.println("a/b="+(a/b));
  System.out.println("b/a="+(b/a));
  System.out.println("b/a="+(int)(b/a)); //cast float to int
  System.out.println("a%b="+(a%b));
  System.out.println("b%a="+(b%a));
  
    
  }
}