public class Liss{
  
  public static void main(String[] args){
    
    double dt=0.01;
    double t=0;
    double end=1000;
    
    double x;
    double y;
    double new_x;
    double new_y;
    
    double x_mag=1;
    double y_mag=1;
    
    double a=0.3;
    double b=0.2;
    
    double p=0.3;
    
    StdDraw.setXscale( -x_mag-0.2 , x_mag+0.2);
    StdDraw.setYscale(-y_mag-0.2 , y_mag+0.2 );
    
    x=x_mag*Math.cos(a*t);
    y=y_mag*Math.cos(b*t+p);
    
    while(t<end){
      t=t+dt;
      new_x=x_mag*Math.cos(a*t);
      new_y=y_mag*Math.cos(b*t+p);
      StdDraw.line( x,y,new_x,new_y);
      x=new_x;
      y=new_y;}
    
  }
}
      
    
  