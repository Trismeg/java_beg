public class HelloNode{
  
  public static void main(String[] args){
    Node node1 = new Node();
    Node node2 = new Node();
    Node node3 = new Node();
    Node node4 = new Node();
    Node node5 = new Node();
    node1.addNext(node2);
    node1.addNext(node3);
    node1.addNext(node4);
    node1.addNext(node5);
    node2.addNext(node4);
    node2.addNext(node5);
    node3.addNext(node2);
    node3.addNext(node1);
    node4.addNext(node4);
    node4.addNext(node5);
    node4.addNext(node1);
    node5.addNext(node3);
    node5.addNext(node2);
    
//    node1.nexts.removeHead();
//    node2.nexts.removeHead();
//    node3.nexts.removeHead();
//    node4.nexts.removeHead();
//    node5.nexts.removeHead();
    
    for(int i=0;i<node1.nexts.length;i++){
      System.out.println(node1.getNextI(i));}
    System.out.println("1");
  
    for(int i=0;i<node2.nexts.length;i++){
      System.out.println(node2.getNextI(i));}
    System.out.println("2");
    
    for(int i=0;i<node3.nexts.length;i++){
      System.out.println(node3.getNextI(i));}
    System.out.println("3");
    
    for(int i=0;i<node4.nexts.length;i++){
      System.out.println(node4.getNextI(i));}
    System.out.println("4");
    
    for(int i=0;i<node5.nexts.length;i++){
      System.out.println(node5.getNextI(i));}
    System.out.println("5");
    
    
  }



}