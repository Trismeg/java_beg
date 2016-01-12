import java.util.Scanner;

public class Scanning{
  
  public static void main(String[] args){
    String saying;
    Scanner scan = new Scanner(System.in);
    
    System.out.println( "input stuff");
    
    saying = scan.nextLine();
    
    System.out.println( "in CAPS the input was " + saying.toUpperCase());
    
  }
}