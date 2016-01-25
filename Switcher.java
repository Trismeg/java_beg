public class Switcher{
  
   public static int tener(){
      return (int) (10*Math.random()+1);
    }
   
   public static int[] tenArray(int n){
     int[] whatever = new int[n];
     for (int i=0; i<n ; i++){
       whatever[i]=tener();}
     return whatever;
     }
   
   public static void printer(int[] jim){
     for(int i=0; i<jim.length ; i++){
       System.out.print(jim[i]+", ");}
   }
   
   public static void reverser(int[] jim){
     int temp;
     for(int i=0; i<(jim.length/2); i++){
       temp=jim[i];
       jim[i]=jim[jim.length-1-i];
       jim[jim.length-1-i]=temp;
     }
   }
  
  
  public static void main(String[] args){
    
    int L= 19;
    int[] test = tenArray(L);
    
    printer(test);
    System.out.println(" ");
    reverser(test);
    printer(test);
       
  }
 }