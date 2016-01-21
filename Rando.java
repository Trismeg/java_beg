public class Rando{
  
   public static int tener(){
      return (int) (10*Math.random()+1);
    }
   
   public static int[] tenArray(int n){
     int[] whatever = new int[n];
     for (int i=0; i<n ; i++){
       whatever[i]=tener();}
     return whatever;
     }
  
  public static void main(String[] args){
    
    System.out.println(tener());
    
    int L= 20;
    int[] test = tenArray(L);
    
    for(int i=0; i<L; i++)
    {System.out.println(test[i]);}
    
  }
 }