public class HelloTree{
 
  public static void printtree(Node root){
    System.out.println(root);
    
    if(!root.nexts.s){
    for(int i=0;i<root.nexts.length;i++){
    printtree(root.getNextI(i));
    }}
  }
    
  
  public static void main(String[] args){
    Node node1 = new Node();
    Node node2 = new Node();
    Node node3 = new Node();
    Node node4 = new Node();
    Node node5 = new Node();
    node1.addNext(node2);
    node1.addNext(node5);   
    node2.addNext(node4);
    node2.addNext(node3);
    
    printtree(node1);
    
    System.out.println(node5.nexts.length);
        
    
     
  }
}