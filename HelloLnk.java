public class HelloLnk{
 
  public static void main(String[] args){
  
  String word1 = new String("one");  
  String word2 = new String("two");
    
  Lnk link0 = new Lnk();
  link0.setPayload(word1);
  
  Lnk link1 = new Lnk(link0);
  link1.setPayload(word2);
  
  System.out.println(link0);
  link0=null;
  System.out.println(link0);
  
  //System.out.println(link1);
  //System.out.println(link1.getPayload());
  
 System.out.println(link1.getNext());
 //  System.out.println(link1.getNext().getPayload());
    
  }
  
  
  
}