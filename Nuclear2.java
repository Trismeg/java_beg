import java.util.Scanner;

public class Nuclear2{
  
   public static boolean no_decay(double chance_of_decay){
      return ( Math.random() > chance_of_decay);
      //This method will return "true" if the isotope survives and "false if it decays.
      //Decay occurs if the random number 0 to 1 is greater than chance.
      //The input "chance" is the probability of decay per iteration
    }
   
  public static void main(String[] args){
     
    Scanner scan = new Scanner(System.in);
    
    int N; //set the initial number of atoms A
    int M=0; //number of B
    int L=0; //number of C
    System.out.println( "input N, the initial number of atoms.");
    N = scan.nextInt();
    
    int surviveA; // this is a temporary variable to count the number of survivors of A per iteration
    int surviveB; // this is a temporary variable to count the number of survivors of A per iteration
    int surviveC; // this is a temporary variable to count the number of survivors of A per iteration
    
    double probAB; // this is the chance of decay process happening for an atom A to B each iteration
    System.out.println( "input P, the probability of decay for A to B.");
    probAB = scan.nextDouble();
    
     double probBC; // this is the chance of decay process happening for an atom B to C each iteration
    System.out.println( "input P, the probability of decay for B to C.");
    probBC = scan.nextDouble();
    
    int steps=0;
    
    StdDraw.setXscale( 0. , 8.0 / probAB);
    StdDraw.setYscale(0. , (float) N );
    
    while(N>0){
      System.out.print( N + " ");
      System.out.print( M + " ");
      System.out.print( L + " ");
      StdDraw.point((double) steps , (float) N );
      StdDraw.point((double) steps , (float) M );
      StdDraw.point((double) steps , (float) L );
      surviveA = 0; surviveB = 0; surviveC = 0;  steps++;
      for(int i=0; i<N; i++){
        if( no_decay( probAB) ){
          surviveA++;
        }
      }
      
      StdDraw.line( steps -1,N,steps,surviveA);
      M=N-surviveA;
      N=surviveA;
      for(int i=0; i<N; i++){
        if( no_decay( probBC) ){
          surviveB++;
        }
      }
      
      StdDraw.line( steps -1,M,steps,surviveB);
      L=M-surviveB;
      M=surviveB;
      
      
      
    }
    
    System.out.print( "0"+ "\nThe number of time steps was " + steps + "\n");
    
  }
  
}
