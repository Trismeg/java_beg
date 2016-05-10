public class HelloDNodeNet{
  
  public static void main(String[] args){
    
    DNodeNet net = new DNodeNet();
    
    double k = 0.05;
    int L=500;
    
    for(int i=0; i<L; i++){
      net.addDNode(new DNode());}
    
    for(int i=0; i<net.nodes.length; i++){
      for(int j=0; j<net.nodes.length;j++){
        if(Math.random()<k){
          net.flow(i,j);}}}
    

//    for(int i=0; i<L; i++){
//      net.printI(i);}
    
    StdDraw.setXscale( -1.1 , 1.1);
    StdDraw.setYscale(-1.1 , 1.1 ); 
    
//    for(int i=0;i<L;i++){
//      StdDraw.circle(Math.cos(6.28*i/L), Math.sin(6.28*i/L), 0.05);
//    StdDraw.text(Math.cos(6.28*i/L), Math.sin(6.28*i/L), Integer.toString(i));}
    
    net.circle();
    
    for(int i=0;i<L;i++)
    { net.graphI(i);}
    
    
  }
}