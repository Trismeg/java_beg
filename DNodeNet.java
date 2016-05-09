public class DNodeNet{
  
  DLnkLoop nodes = new DLnkLoop();
  int n =0;
  public DNodeNet(){}
  
  public void addDNode(DNode newnode){
    DLnk nodelnk = new DLnk(newnode);
    nodes.addDLnk(nodelnk);
    newnode.n=this.n;
    n++;}
  
  public DNode getDNodeI(int i){
    return (DNode) nodes.getiLnk(i).getPayload();}
  
  public void flow(int from, int to){
    this.getDNodeI(from).addNext(getDNodeI(to));}
  
  public void printI(int x){
    for(int i=0;i< this.getDNodeI(x).nexts.length;i++){
      System.out.println(this.getDNodeI(x).getNextI(i));}
    System.out.println("next/prev");
    for(int i=0;i<this.getDNodeI(x).prevs.length;i++){
      System.out.println(this.getDNodeI(x).getNextI(i));}   
    System.out.println(x);
    
  }
  
  public void circle(){
    for(int i=0; i<nodes.length;i++){
      this.getDNodeI(i).x=Math.cos(2*Math.PI*i/nodes.length);
      this.getDNodeI(i).y=Math.sin(2*Math.PI*i/nodes.length);
    }}
  
  public void graphI(int x){
    StdDraw.circle(this.getDNodeI(x).x,this.getDNodeI(x).y , 0.05);
    StdDraw.text(this.getDNodeI(x).x, this.getDNodeI(x).y, Integer.toString(x));
    for(int i=0;i< this.getDNodeI(x).nexts.length;i++){
      StdDraw.line(this.getDNodeI(x).x, this.getDNodeI(x).y, this.getDNodeI(x).getNextI(i).x+0.05, this.getDNodeI(x).getNextI(i).y);}}
    
  
      
     
    
    
  
  
}
    