public class Link{
  
  Object cache;
  Link next;

  public Link(){}
  
  public Link(Link next){this.next=next;}
  
  public Link(Link next, Object cache){
    this.next=next;
    this.cache=cache;}


}