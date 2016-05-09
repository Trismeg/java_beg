public class DNode{
  
  private Object payload;
  public double x,y;
  public int n;
  public DLnkLoop nexts = new DLnkLoop();
  public DLnkLoop prevs = new DLnkLoop();
  
  public DNode(){} 
  
  public DLnkLoop getNexts(){
    return this.nexts;}
  
  public Object getPayload(){
    return this.payload;}
  
  public void setNexts(DLnkLoop newNexts){
    this.nexts=newNexts;}
  
  public void setPayload(Object newPayload){
    this.payload=newPayload;}
  
  public void addNext(DNode nextnode){
    DLnk nodlnk= new DLnk(nextnode);
    nextnode.prevs.addDLnk(new DLnk(this));
    nexts.addDLnk(nodlnk);}
  
  public void addPrev(DNode prevnode){
    DLnk nodlnk= new DLnk(prevnode);
    prevs.addDLnk(nodlnk);}
  
  public DNode getNextI(int i){
    return (DNode) nexts.getiLnk(i).getPayload();}
  
}
  