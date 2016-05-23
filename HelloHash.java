public class HelloHash{
  
  public static void main(String[] args){
    
    String thing1 = new String("newb");
    String thing2 = new String("noob");
    String thing3 = new String("newb");
    
    System.out.println("newb".hashCode());
    System.out.println(thing1.hashCode());
    System.out.println((thing1+thing2).hashCode());
    System.out.println("newbnoob".hashCode());
    System.out.println(thing3.hashCode());
    System.out.println("newbnoob ".hashCode());
       
    System.out.println("----------");
    
    Lnk link1 = new Lnk(null,thing1);
    Lnk link2 = new Lnk(null,thing2);
    Lnk link3 = new Lnk(null,thing3);
    System.out.println(link1.hashCode());
    System.out.println(link2.hashCode());
    System.out.println(link3.hashCode());
    thing2=thing1;
    System.out.println(link2.hashCode());
    link2.setNext(link1);
    System.out.println(link2.hashCode());
    link2=link1;
    System.out.println(link2.hashCode());
    
    
    
    
    
    
  }}
    