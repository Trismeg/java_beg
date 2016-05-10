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
 
 public void add(TNode newnode){
   int open = this.empty();
   int parent=open/2;
   if((open%2)==0){
     this.getI(parent).left=newnode;}
   else{this.getI(parent).right=newnode;}}

 public int count(){
  int sum = 0;
  if(this==null){}
  else{sum=sum+1;}
  if(this.left==null){}
  else{sum=sum+this.left.count();}
  if(this.right==null){}
  else{sum=sum+this.right.count();}
  return sum;
 }
 
 public static void main(String[] args){
    TNode node1 = new TNode();
    TNode node2 = new TNode();
    TNode node3 = new TNode();
    TNode node4 = new TNode();
    TNode node5 = new TNode();
    TNode nodeB = new TNode();
    node1.left=node2;
    node1.right=node3;   
    node2.left=node4;
    node2.right=node5;
    node3.right=nodeB;
       
    for(int i=1;i<10;i++){
    System.out.println(i+" " + node1.getI(i));
    }
    
    System.out.println("empty " + node1.empty());    
  System.out.println("count " + node1.count());  
 
 TNode nodeA = new TNode();
 node1.add(nodeA);
 
 for(int i=1;i<10;i++){
    System.out.println(i+" " + node1.getI(i));
    }
 System.out.println("empty " + node1.empty());
 System.out.println("count " + node1.count()); 
 } 
}