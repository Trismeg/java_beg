public class Lnk{
  
  private Object payload;
  private Lnk next;
  
  public Lnk(){}
  
  public Lnk(Lnk next){
    this.next=next;}
  
  public Lnk(Lnk next, Object payload){
    this.next = next;
    this.payload = payload;}
 
  public Lnk getNext(){
    return this.next;}
  
  public Object getPayload(){
    return this.payload;}
  
  public void setNext(Lnk newNext){
    this.next=newNext;}
  
  public void setPayload(Object newPayload){
    this.payload=newPayload;}
  
}
  