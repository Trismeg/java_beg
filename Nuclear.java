public class Nuclear{
  
   public static boolean no_decay(double chance_of_decay){
      return ( Math.random() > chance_of_decay);
      //This method will return "true" if the isotope survives and "false if it decays.
      //Decay occurs if the random number 0 to 1 is greater than chance.
      //The input "chance" is the probability of decay per iteration
    }
   
  public static void main(String[] args){
    
    int N=100; //set the initial number of atoms
    int survive; // this is a temporary variable to count the number of survivors per iteration
    double prob=0.5; // this is the chance of decay process happening for an atom each iteration
    int steps=0;
    
    while(N>0){
      System.out.print( N + " ");
      survive = 0;  steps++;
      for(int i=0; i<N; i++){
        if( no_decay( prob) ){
          survive++;
        }
      }
      N=survive;
    }
    
    System.out.print( "0"+ "\n The number of time steps was " + steps + "\n");
    
  }
  
}
