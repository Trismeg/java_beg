public class HelloDNodeNet{
  
  public static void main(String[] args){
    
    DNodeNet net = new DNodeNet();
    
    for(int i=0; i<5; i++){
      net.addDNode(new DNode());}
    
    net.flow(0,1);
    net.flow(0,2);
    net.flow(0,3);
    net.flow(0,4);
    
    net.flow(1,3);
    net.flow(1,4);
    
    net.flow(2,0);
    net.flow(2,1);
    
    net.flow(3,0);
    net.flow(3,0);
    net.flow(3,4);
    
    net.flow(4,1);
    net.flow(4,2);
   
    for(int i=0; i<5; i++){
      net.printI(i);}
    
     
  }
}