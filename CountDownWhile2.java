public class CountDownWhile2{
  
  public static void main(String[] args){
    
    int count = 10;
    
    while(true){
      System.out.println(count);
      count=count-1;
      if (count==0){
        break;
      }
      //count--;
      //System.out.println(count);
    }
  }
}