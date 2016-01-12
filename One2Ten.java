public class One2Ten{
  
  public static void main(String[] args){
    double randFloat=10 * Math.random();
    double topFloat=Math.ceil(randFloat);
    System.out.println(randFloat);
    System.out.println(topFloat);
    int randInt;
    randInt = (int) topFloat;
    System.out.println(randInt);
    
    
    
  }
}