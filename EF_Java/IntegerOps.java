public class IntegerOps{
  
  public static void main (String[] args){
  int a,b;
  a=6; b=3;
  
  System.out.println("a="+a+" b="+b);
  System.out.println("a+b="+a+b);//NOT GOOD!!!!
  System.out.println("a+b="+(a+b));
  System.out.println("a-b="+(a-b));
  System.out.println("a*b="+(a*b));
  System.out.println("a/b="+(a/b));
  System.out.println("b/a="+(b/a));
  System.out.println("b/a="+(((float)b)/a));//cast int to float
  System.out.println("b/a="+(b/((float)a)));//cast int to float
  System.out.println("a%b="+(a%b));
  System.out.println("b%a="+(b%a));
  
    
  
  }
}