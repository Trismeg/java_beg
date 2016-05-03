public class LnkLoop{
  
  private Lnk head;
  public int length = 0;
   
  public LnkLoop(){
    head.setNext(head); 
    this.length=this.length + 1;}
  
  public LnkLoop(Lnk newlink){
    this.head=newlink;
    this.head.setNext(head); 
    this.length=this.length + 1;}
  
  public void addLnk(Lnk newlink){
    newlink.setNext(this.head.getNext());
    this.head.setNext(newlink);
    length=length + 1;}

  public Lnk getiLnk(int i){
    Lnk it = this.head;
    while(i>0){
      it=it.getNext();
      i=i-1;}
    return it;}
  
  public void removeHead(){
    this.getiLnk(length-1).setNext(this.head.getNext());
    this.head=this.head.getNext();
    length = length -1;}
  
  public Lnk getHead(){
    return this.head;}
  
  public Object getPay(){
    return this.head.getPayload();}
  
  public void setHeadPay(Object pay){this.head.setPayload(pay);}
  
  public void advance(int i){
    while(i>0){
      head=head.getNext();
      i=i-1;}}
   
}