import java.util.Scanner;
import java.util.*;
import java.awt.Font;

public class Nuclear2simon{
  
   public static boolean no_decay(double chance_of_decay){
      return ( Math.random() > chance_of_decay);
      //This method will return "true" if the isotope survives and "false if it decays.
      //Decay occurs if the random number 0 to 1 is greater than chance.
      //The input "chance" is the probability of decay per iteration
    }
   
  public static void main(String[] args){
     
    Scanner scan = new Scanner(System.in);
    
    int A; //set the initial number of atoms A
    double D;
    int B=0; //number of B
    int C=0; //number of C
    System.out.println( "input the initial number of atoms.");
    A = scan.nextInt();
    
    D = A;
    
    int newA; // this is a temporary variable to count the number of survivors of A per iteration
    int newB; // this is a temporary variable to count the number of survivors of B per iteration
    int newC; // this is a temporary variable to count the number of survivors of C per iteration
    
    int addB;
    int addC;
    
    ArrayList <Integer>arrB = new ArrayList<Integer>();
    ArrayList <Integer>arrSteps = new ArrayList<Integer>();
    
    double probAB; // this is the chance of decay process happening for an atom A to B each iteration
    System.out.println( "input P, the probability of decay for A to B.");
    probAB = scan.nextDouble();
    
     double probBC; // this is the chance of decay process happening for an atom B to C each iteration
    System.out.println( "input P, the probability of decay for B to C.");
    probBC = scan.nextDouble();
    
    int steps=0;
    
    StdDraw.setXscale( 0. , 8.0 / Math.min(probAB,probBC));
    StdDraw.setYscale(0. , (float) A );
    
    System.out.print( "steps" + " ");
      System.out.print( "A" + " ");
      System.out.print( "B" + " ");
      System.out.print( "C" + "\n");
    
    while(A>0 | B>0){
      System.out.print( steps + " ");
      System.out.print( A + " ");
      System.out.print( B + " ");
      System.out.print( C + "\n");
      
      arrB.add(B);
      arrSteps.add(steps);
      
      StdDraw.point((double) steps , (float) A );
      StdDraw.point((double) steps , (float) B );
      StdDraw.point((double) steps , (float) C );
     
      newA = 0; newB = 0; newC = 0;  addB=0; addC=0;
      steps++;
      
      for(int i=0; i<A; i++){
        if( no_decay( probAB) ){
          newA++;
        }
      }
      
      StdDraw.line( steps -1,A,steps,newA);
      
      addB=(A-newA);
      A=newA;
      
      for(int i=0; i<B; i++){
        if( no_decay( probBC) ){
        }
        else{
          addC++;
        }
      }
      
      newB=B+addB-addC;
      StdDraw.line( steps -1,B,steps,newB);
      B=newB;
      
      newC=C+addC;
      StdDraw.line( steps -1,C,steps,newC);  
      C=newC;
      
      
      
      
    }
    int maxB=0;
    int maxBsteps=0;
    float P=steps;
    
    for(int i=0; i<arrB.size(); i++){
      if (arrB.get(i)>maxB){
        maxB=arrB.get(i);
        maxBsteps=arrSteps.get(i);}}
   Font f = new Font("Arial", Font.PLAIN, 12); 
   StdDraw.setPenColor(StdDraw.BLUE);  
   StdDraw.line( maxBsteps,maxB,maxBsteps,0);
   StdDraw.setFont(f);
   StdDraw.textLeft( maxBsteps,maxB+(D*0.02),"Maximum"+" "+Integer.toString(maxB));
   StdDraw.textLeft( maxBsteps+(P*0.01),D*0.02,"Steps"+" "+Integer.toString(maxBsteps));
    
    System.out.print( "\nThe maximum of B is " + maxB + " which takes " + maxBsteps + " steps to reach it." + "\n");
    System.out.print( "\nThe number of time steps was " + steps + "\n");
    
  }
  
}