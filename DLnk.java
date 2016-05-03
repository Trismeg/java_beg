public class DLnk{
  
  private Object payload;
  private DLnk next;
  private DLnk prev;
  
  public DLnk(){}
  
  public DLnk(DLnk next, DLnk prev){
    this.next=next;
    this.prev=prev;}
  
  public DLnk(DLnk next, DLnk prev, Object payload){
    this.next = next;
    this.prev=prev;
    this.payload = payload;}
 
  public DLnk getNext(){
    return this.next;}
  
  public DLnk getPrev(){
    return this.prev;}
  
  public Object getPayload(){
    return this.payload;}
  
  public void setNext(DLnk newnext){
    this.next=newnext;}
  
  public void setPrev(DLnk newprev){
    this.prev=newprev;}
  
  public void setPayload(Object newPayload){
    this.payload=newPayload;}
  
}
  