public class OneToFive{
  
  public static void main(String[] args){
    
    double floater = 5*Math.random();
    double floored = Math.floor(floater);
    int output = ((int) floored )+1;
    System.out.println("The random integer is " + output);
    
  }
}