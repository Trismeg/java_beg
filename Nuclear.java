import java.util.Scanner;

public class Nuclear{
  
   public static boolean no_decay(double chance_of_decay){
      return ( Math.random() > chance_of_decay);
      //This method will return "true" if the isotope survives and "false if it decays.
      //Decay occurs if the random number 0 to 1 is greater than chance.
      //The input "chance" is the probability of decay per iteration
    }
   
  public static void main(String[] args){
     
    Scanner scan = new Scanner(System.in);
    
    int N; //set the initial number of atoms
    System.out.println( "input N, the initial number of atoms.");
    N = scan.nextInt();
    
    int survive; // this is a temporary variable to count the number of survivors per iteration
    
    double prob; // this is the chance of decay process happening for an atom each iteration
    System.out.println( "input P, the probability of decay.");
    prob = scan.nextDouble();
    
    int steps=0;
    
    StdDraw.setXscale( 0. , 8.0 / prob);
    StdDraw.setYscale(0. , (float) N );
    
    while(N>0){
      System.out.print( N + " ");
      StdDraw.point((double) steps , (float) N );
      survive = 0;  steps++;
      for(int i=0; i<N; i++){
        if( no_decay( prob) ){
          survive++;
        }
      }
      
      StdDraw.line( steps -1,N,steps,survive);
      
      N=survive;
    }
    
    System.out.print( "0"+ "\nThe number of time steps was " + steps + "\n");
    
  }
  
}
