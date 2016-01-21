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
    {System.out.print(test[i]+" ");}
    
    int temp;
    boolean flagG = true;
    boolean flag1 = true;
    
    while( flagG )
    {
      flag1=true;
      
    for (int i=0; i<(L-1); i++){
      if(test[i+1]<test[i]){
        temp=test[i+1];
        test[i+1]=test[i];
        test[i]=temp;
        flag1=false;
      }
      if(i==(L-2)){
        if(flag1==true){
          flagG=false;
        }
      }
    }
    }
    
    {System.out.println(" ");}
    
    for(int i=0; i<L; i++)
    {System.out.print(test[i]+" ");}
    
  }
 }