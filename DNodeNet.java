public class DNodeNet{
  
  DLnkLoop nodes = new DLnkLoop();
  
  public DNodeNet(){}
  
  public void addDNode(DNode newnode){
    DLnk nodelnk = new DLnk(newnode);
    nodes.addDLnk(nodelnk);}
  
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
  
}
    