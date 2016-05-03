public class LnkList{
  
  private Lnk head = null;
  public int length = 0;
  
  public LnkList(){}
  
  public void addLnk(Lnk newlink){
    newlink.setNext(this.head);
    this.head=newlink;
    length=length + 1;}

  public Lnk getiLnk(int i){
    Lnk it = this.head;
    while(i>0){
      it=it.getNext();
      i=i-1;}
    return it;}
  
  public void removeHead(){
    this.head=this.head.getNext();
    length = length -1;}
  
  public Lnk getHead(){
    return this.head;}
   
}

    
  