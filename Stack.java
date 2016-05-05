public class Stack{
  
  private Lnk head = new Lnk();
  public int length = 0;
  
  public Stack(){}
  
  public Stack(Lnk newlink){
  this.head=newlink;}
  
  public void push(Lnk newlink){
    newlink.setNext(this.head);
    this.head=newlink;
    length=length + 1;}

  public Lnk pop(){
    Lnk output = head;
    this.head=this.head.getNext();
    length=length-1;
    return output;}
  
  public Lnk peek(){
    return this.head;}
  
 
    
}

    
  