public class HelloDNode{
  
  public static void main(String[] args){
    DNode node1 = new DNode();
    DNode node2 = new DNode();
    DNode node3 = new DNode();
    DNode node4 = new DNode();
    DNode node5 = new DNode();
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
        
    for(int i=0;i<node1.nexts.length;i++){
      System.out.println(node1.getNextI(i));}
    System.out.println("next/prev");
    for(int i=0;i<node1.prevs.length;i++){
      System.out.println(node1.getNextI(i));}   
    System.out.println("1");
  
    for(int i=0;i<node2.nexts.length;i++){
      System.out.println(node2.getNextI(i));}
    System.out.println("next/prev");
    for(int i=0;i<node2.prevs.length;i++){
      System.out.println(node2.getNextI(i));}   
    System.out.println("2");
    
    
    for(int i=0;i<node3.nexts.length;i++){
      System.out.println(node3.getNextI(i));}
    System.out.println("next/prev");
    for(int i=0;i<node3.prevs.length;i++){
      System.out.println(node3.getNextI(i));}   
    System.out.println("3");
    
    for(int i=0;i<node4.nexts.length;i++){
      System.out.println(node4.getNextI(i));}
    System.out.println("next/prev");
    for(int i=0;i<node4.prevs.length;i++){
      System.out.println(node4.getNextI(i));}   
    System.out.println("3");
    
    for(int i=0;i<node5.nexts.length;i++){
      System.out.println(node5.getNextI(i));}
    System.out.println("next/prev");
    for(int i=0;i<node5.prevs.length;i++){
      System.out.println(node5.getNextI(i));}   
    System.out.println("5");
     
  }
}