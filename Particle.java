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
 
 public static void main(String[] args){
   Particle e1 = new Particle ( M_E,-E,"electron");
   e1.setPosition(0,A0);
   Particle p1 = new Particle ( M_P,E,"proton");
   p1.setPosition(0,0);
   
   double pe_1_2 = e1.pEnergy(p1);
   System.out.println(pe_1_2);
   
   Particle[] particles = new Particle[10000];
   for(int i=0; i<particles.length; i++){
     particles[i]= new Particle(M_E,-E,"electron");
     particles[i].setPosition(Math.random(),Math.random());}
   
   System.out.println(totalPEnergy(particles));
 }
 
}