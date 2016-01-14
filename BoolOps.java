public class BoolOps{
  
  public static void main(String[] args){
    boolean state1 = true;
    boolean state2 = false;
    System.out.println("State1="+ state1);
    System.out.println("State2="+ state2);
    System.out.println("State1 and State2="+(state1 && state2)); //AND is &&
   // System.out.println(!state1);//! is NOT
    System.out.println("State1 or State2="+ (state1 | state2));
    boolean funky = !(state1 | state2) | (state1 && state2);
    System.out.println("State1 funky State2="+ funky);
    
    state1 = (1==2);
    state2 = (1==1);
    System.out.println("State1="+ state1);
    System.out.println("State2="+ state2);
    
  }
}