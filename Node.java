public class Node{
  
  private Object payload;
  public DLnkLoop nexts = new DLnkLoop();
  
  public Node(){}
  
  public Node(DLnkLoop nexts){
    this.nexts=nexts;}
  
  public DLnkLoop getNexts(){
    return this.nexts;}
  
  public Object getPayload(){
    return this.payload;}
  
  public void setNexts(DLnkLoop newNexts){
    this.nexts=newNexts;}
  
  public void setPayload(Object newPayload){
    this.payload=newPayload;}
  
  public void addNext(Node nextnode){
    DLnk nodlnk= new DLnk(nextnode);
    nexts.addDLnk(nodlnk);}
  
  public Node getNextI(int i){
    return (Node) nexts.getiLnk(i).getPayload();}
  
}
  