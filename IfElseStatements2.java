public class IfElseStatements2{
  
  public static void main(String[] args){
   // boolean state1 = true;
    int number = 18;
    
    
    if ( (number%2)==0 ){
      System.out.println(number +" is even");
    }
    
    if ( (number%2)!=0 ){
      System.out.println(number +" is odd"); //Not the best way to do this
    }
    
    
    if ( (number%2)==0 ){
      System.out.println(number +" is even");
    }
    else {
      System.out.println(number +" is odd"); //Not the best way to do this
    }
  }
}