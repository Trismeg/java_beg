public class ProjectOne {
  
  public static void main (String[] args){
    
    String utterance = new String("hElPhELpBrO!");
    //String numbers = new String("123456789");
    
    //System.out.println( utterance );
    //System.out.println( numbers.length() );
    //System.out.println( numbers.substring(3,6) );
    
    //Write a line of code that prints the "utterance"
    //without the last character !
    //System.out.println( utterance.substring(0,utterance.length()-1) );
    String utter2 = utterance.substring(0,utterance.length()-1);
    String utter3 = utter2.toLowerCase();
    String first = utterance.substring(0,1).toUpperCase();
    String last = utter3.substring(1,utter3.length());
    String firstLast = first.concat(last);
    //String firstLast2 = first + last;
    //System.out.println( first);
    //System.out.println( last);
    System.out.println( firstLast);
    //System.out.println( firstLast2);
    //System.out.println( first + last);
    
  } 
}