public class DLnkLoop{
  
  private DLnk head= new DLnk();
  public int length = 0;
  public boolean s=true;
   
  public DLnkLoop(){
    head.setNext(head); 
    head.setPrev(head);
    this.length=this.length + 1;}
  
  public DLnkLoop(DLnk newlink){
    s=false;
    this.head=newlink;
    this.head.setNext(head); 
    this.length=this.length + 1;}
  
  public void addDLnk(DLnk newlink){    
    newlink.setNext(this.head.getNext());
    this.head.getNext().setPrev(newlink);
    newlink.setPrev(this.head);
    this.head.setNext(newlink);
    if(s){removeHead(); s=false;}
    length=length + 1;}

  public DLnk getiLnk(int i){
    DLnk it = this.head;
    if(i>0){
    while(i>0){
      it=it.getNext();
      i=i-1;}}
    else if(i<0){
      while(i<0){
      it=it.getPrev();
      i=i+1;}}
    else{return it;}
    return it;}
  
  public void removeHead(){
    this.head.getPrev().setNext(head.getNext());
    this.head.getNext().setPrev(head.getPrev());
    this.head=this.head.getNext();
    length = length -1;}
  
  public DLnk getHead(){
    return this.head;}
  
  public Object getPay(){
    return this.head.getPayload();}
  
  public void setHeadPay(Object pay){this.head.setPayload(pay);}
  
  public void advance(int i){
    if(i>0){
    while(i>0){
      head=head.getNext();
      i=i-1;}}
    if(i<0){
    while(i>0){
      head=head.getPrev();
      i=i+1;}
    }}
   
}