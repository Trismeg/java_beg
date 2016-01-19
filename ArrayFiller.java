import java.util.Scanner;

public class ArrayFiller{
  
  public static void main(String[] args){
    int number, sum;
    String say;

    Scanner scan = new Scanner(System.in);
    
    System.out.println( "input the number of people");
    
    number = Integer.parseInt(scan.nextLine());
    
    System.out.println( "the number is  " + number);
    
    String[] people = new String[number];
    double[] avgs = new double[number];
    
    for(int i=0; i<number ; i++){
      System.out.println( "input person number " + (i+1) );
      people[i]=scan.nextLine();
    }
    
    System.out.print( "There are " + number + " people. They are " );
    
    int a=0;
    while(a<(number-1)){
      System.out.print( people[a] +  ", ");
      a++;
    }
    System.out.print( "and " + people[number-1]+"." );
    
    for(  int i=0; i<number ; i++){
      a=0;
      sum=0;
        while(true){
         System.out.println( "Input test" + (a+1) + " for " + people[i]+ ".");
         say=scan.nextLine();
         if(say.equals("end")){break;}
         else{
           sum = sum + Integer.parseInt(say);
           a=a+1;}
         }
      avgs[i]=((float) sum)/a;
     }
    
    for(  int i=0; i<number ; i++){
      System.out.println( people[i]+ " averaged " + avgs[i]+ ".");

}
      
    
    
    
  }
}