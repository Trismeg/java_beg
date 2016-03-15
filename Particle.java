public class Particle {
  
  
  double mass;
  double charge;
  String name;
  double x;
  double y;
  
  static final double E = 1.6 * pTen(-19);
  static final double M_E = 9.1 * pTen(-31);
  static final double M_P = 1.67 * pTen(-27);
  static final double K = 9.0 * pTen(9);
  static final double A0 = 0.53 * pTen(-10);
  
  public static double pTen(double x){
    return Math.pow(10,x);}
    
 public Particle ( double mass, double charge, String name){
   this.mass = mass;
   this.charge = charge;
   this.name = name;}
 
 public void setPosition(double x, double y){
   this.x=x;
   this.y=y;}
 
 public double pEnergy(Particle b){
   double distance = Math.pow( (this.x-b.x)*(this.x-b.x)+(this.y-b.y)*(this.y-b.y) ,0.5);
   return K*this.charge*b.charge/distance;}
 
 public static double totalPEnergy(Particle[] parts){
   double sum = 0;
   for(int i =0; i<parts.length-1; i++){
     for(int j=i+1; j<parts.length; j++){
       sum = sum + parts[i].pEnergy(parts[j]);}}
   return sum;}
 
 public double partialPEnergy(int k, Particle[] parts){
   double sum=0;
   for(int i=0;i<parts.length;i++){
     if(i!=k){sum=sum+parts[i].pEnergy(parts[k]);}}
   return sum;}
 
  public double[] grad(int k, Particle[] parts, double delta){  
   double temp_x = parts[k].x;
   double temp_y = parts[k].y;
   
   parts[k].setPosition(temp_x,temp_y+delta);
   double parE_u=partialPEnergy(k,parts);
   parts[k].setPosition(temp_x,temp_y-delta);
   double parE_d=partialPEnergy(k,parts);
   parts[k].setPosition(temp_x,temp_y-delta);
   double parE_l=partialPEnergy(k,parts);
   parts[k].setPosition(temp_x+delta,temp_y);
   double parE_r=partialPEnergy(k,parts);
   
   parts[k].setPosition(temp_x,temp_y);
   double grad_x=(parE_r-parE_l)/(2*delta);
   double grad_y=(parE_u-parE_d)/(2*delta);
   
   double[] output = new double[2];
   output[0]=grad_x;
   output[1]=grad_y;
   
   return output;
  
  }
 
 
 
 public static void main(String[] args){
   Particle e1 = new Particle ( M_E,-E,"electron");
   e1.setPosition(0,A0);
   Particle p1 = new Particle ( M_P,E,"proton");
   p1.setPosition(0,0);
   
   double pe_1_2 = e1.pEnergy(p1);
   System.out.println(pe_1_2);
   
  /* Particle[] particles = new Particle[100];
   for(int i=0; i<particles.length; i++){
     particles[i]= new Particle(M_E,-E,"electron");
     particles[i].setPosition(Math.random(),Math.random());}
   */
   double r;
   double theta;
   Particle[] particles = new Particle[100];
   for(int i=0; i<particles.length; i++){
     particles[i]= new Particle(M_E,-E,"electron");
     r=Math.random();
     theta= 2*Math.PI*Math.random();
     particles[i].setPosition(r*Math.cos(theta),r*Math.sin(theta));}
   
   boolean state = true;
  
  /* 
   while(state){
     for(int i=0; i<particles.length; i++){
       parE=partialPEnergy(i, particles);
       
   */
   System.out.println(totalPEnergy(particles));
 }
 
}