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
 
 public void remove(int i){
   int parent=i/2;
   if((i%2)==0){
   this.getI(parent).left=null;}
   else{this.getI(parent).right=null;}}
 
 public void add(TNode newnode){
   int open = this.empty();
   int parent=open/2;
   if((open%2)==0){
     this.getI(parent).left=newnode;}
   else{this.getI(parent).right=newnode;}}
 
 public void add(TNode newnode, int open){
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
 
 public boolean isComplete(){
   if(this.empty()==(this.count()+1)){return true;}
   else{ return false;}}
 
 public void completer(){
   int space = 0;
   int i;
   while(!(this.isComplete())){
     space=this.empty();
     i = space + 1;
     while(this.getI(i)==null){
       i++;}
     this.add(getI(i), space);
     this.remove(i);       
   }
   }
 
 //switcheroo swaps the objects in TNode i and j
 public void switcheroo(int i, int j){
   if( this.getI(i)==null | this.getI(j)==null){}
   else{
   Object temp = this.getI(i).payload;
   this.getI(i).payload=this.getI(j).payload;
   this.getI(j).payload=temp;}}

 //assume tree is complete
 public boolean bubblePass(){
   boolean flag=false;
   int deep = this.empty();
   for(int i=2; i<deep; i++){
     
       if(i%2==0){
       if(((Integer)(this.getI(i).payload))>((Integer)(this.getI(i+1).payload))){
       this.switcheroo(i,i+1);
       flag=true;}
       
       if(((Integer)(this.getI(i).payload))<((Integer)(this.getI(i/2).payload))){
       this.switcheroo(i,i/2);
       flag=true;}
     }}
   return flag;}
 
 public void bubble(){
   while(this.bubblePass()){this.bubblePass();}}
     
 
 
 
 
  public void graphI(int i){
    TNode read = this.getI(i);   
    if (read!=null){
      String bin = Integer.toBinaryString(i);      
      int height = bin.length()-1;
      int y=height;
      double d=0;      
      for(int j=1;j<bin.length();j++){
        if(bin.charAt(j)=='0'){d=d-1.0/( Math.pow(2,j-1));}
        else{d=d+1.0/( Math.pow(2,j-1));}}
      StdDraw.circle(d,y , 0.1);
      StdDraw.setPenColor(StdDraw.RED);
     StdDraw.text(d-0.2, y, Integer.toString(i));
     StdDraw.setPenColor(StdDraw.BLUE);
     StdDraw.textLeft(d+0.2, y, read.payload.toString());
     StdDraw.setPenColor();
     // StdDraw.text(d+0.2, y, read.toString());
      if(read.left != null){
        StdDraw.line(d, y, d-1.0/Math.pow(2,y), y+1);}
      if(read.right != null){
        StdDraw.line(d, y, d+1.0/Math.pow(2,y), y+1);}
  }}
     
  public void print1(){
    System.out.println((Integer)(this.payload));  
    if(this.left!=null){this.left.print1();}
    if(this.right!=null){this.right.print1();}}
  
   public void print2(){    
    if(this.left!=null){this.left.print2();}
    System.out.println((Integer)(this.payload));
    if(this.right!=null){this.right.print2();}}
   
    public void print3(){   
    if(this.left!=null){this.left.print3();}
    if(this.right!=null){this.right.print3();}
    System.out.println((Integer)(this.payload));}
 
 public static void main(String[] args){
    TNode node1 = new TNode(); node1.payload=new Integer(11);
    TNode node2 = new TNode(); node2.payload=new Integer(8);
    TNode node3 = new TNode(); node3.payload=new Integer(10);
    TNode node4 = new TNode(); node4.payload=new Integer(15);
    TNode node5 = new TNode(); node5.payload=new Integer(6);
    TNode nodeA = new TNode(); nodeA.payload=new Integer(5);
    TNode nodeB = new TNode(); nodeB.payload=new Integer(17);
    TNode nodeC = new TNode(); nodeC.payload=new Integer(70);
    TNode nodeD = new TNode(); nodeD.payload=new Integer(78);
    TNode nodeE = new TNode(); nodeE.payload=new Integer(72);
    node1.left=node2;
    node1.right=node3;   
    node2.left=node4;
    node2.right=node5;
    node3.right=nodeA;
    node4.left=nodeB;
//    nodeB.left=nodeC;
//    nodeC.left=nodeD;
//    nodeD.left=nodeE;
       
    for(int i=1;i<10;i++){
    System.out.println(i+" " + node1.getI(i));
    }
    
    System.out.println("empty " + node1.empty());    
  System.out.println("count " + node1.count()); 
  System.out.println("complete " + node1.isComplete());
 
  StdDraw.setXscale( -3 , 3);
  StdDraw.setYscale(6 , -0.1 );
  
  
  
  
 //TNode nodeA = new TNode();
 //node1.add(nodeA);
 
 node1.completer(); 
  
 for(int i=1;i<10;i++){
    System.out.println(i+" " + node1.getI(i));
    }
 System.out.println("empty " + node1.empty());
 System.out.println("count " + node1.count());
 System.out.println("complete " + node1.isComplete());
 
 node1.bubble();
 
 for(int i=1;i<20;i++){node1.graphI(i);}
 node1.print1();
 System.out.println("ONE");
 node1.print2();
 System.out.println("TWO");
 node1.print3();
 System.out.println("THREE");
 } 
}