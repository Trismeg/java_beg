public class DLnkList{
  
  private DLnk head = new DLnk();
  public int length = 0;
  
  public DLnkList(){}
  
  public void addDLnk(DLnk newlink){
    newlink.setNext(this.head);
    this.head.setPrev(newlink);
    this.head=newlink;
    length=length + 1;}

  public DLnk getiLnk(int i){
    DLnk it = this.head;
    while(i>0){
      it=it.getNext();
      i=i-1;}
    return it;}
  
  public void removeHead(){
    this.head=this.head.getNext();
    this.head.setPrev(null);
    length = length -1;}
  
  public DLnk getHead(){
    return this.head;}
   
}

    
  