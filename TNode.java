public class TNode{
  
  public Object payload;
  public TNode left;
  public TNode right;

public TNode getI(int i){
    String bin = Integer.toBinaryString(i);
    TNode read = this;
    for(int j=1;j<bin.length();j++)
    { if(bin.charAt(j)=='0'){
        if(read.left==null){return null;}
        else{read=read.left;}}
      else{
        if(read.right==null){return null;}
        else{read=read.right;}}
      }
    return read;
  }

 public int empty(){
    int i=1;
    while(true){
      if(this.getI(i)==null){return i;}
      i++;}
  }

 public static void main(String[] args){
    TNode node1 = new TNode();
    TNode node2 = new TNode();
    TNode node3 = new TNode();
    TNode node4 = new TNode();
    TNode node5 = new TNode();
    node1.left=node2;
    node1.right=node3;   
    node2.left=node4;
    node2.right=node5;
       
    for(int i=1;i<7;i++){
    System.out.println(i+" " + node1.getI(i));
    }
    
    System.out.println("empty " + node1.empty());    
  }
 
}