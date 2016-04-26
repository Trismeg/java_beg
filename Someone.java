public class Someone{
  
  Someone father;
  Someone mother;
  boolean is_male;
  boolean is_eve;
   
  static int P = 1000000;
  static int numguys=0;
  static int numgals=0;
  
  public Someone(boolean maleness){
    this.is_male=maleness;
    if(maleness){ numguys=numguys+1;}
    else{numgals=numgals+1;}
  }
  
  public Someone spawn(Someone dad){
    Someone temp = new Someone(Math.random()>0.5);
    temp.father = dad;
    temp.mother = this;
    temp.is_eve = false;
    return temp;}
  
  public static int rando(int max){
    return (int)Math.floor((max+1)*Math.random());}
  
  public boolean evian(){
    if(this.is_eve){return true;}
    else if(this.mother==null){return false;}
    else if(this.mother.evian()){return true;}   
    else{return false;}
  }
  
  public static void main(String[] args){
    //int P=Someone.P;
    Someone[] guys = new Someone[P];
    Someone[] gals = new Someone[P];
    
    Someone adam = new Someone(true);
    Someone steve = new Someone(true);
    guys[0]=adam; guys[1]=steve;
    
    Someone eve = new Someone(false);
    eve.is_eve=true;
    Someone sally = new Someone(false);
    gals[0]=eve; gals[1]=sally;
    
    while( numguys<(P+1) | numgals<(P+1)){
    Someone temp = gals[rando(Math.min(P,numgals)-1)].spawn(guys[rando(Math.min(P,numguys)-1)]);
    if(temp.is_male && numguys<(P+1)){guys[Math.min(P,numguys)-1]=temp;}
    else if(!(temp.is_male) && numgals<(P+1)){gals[Math.min(P,numgals)-1]=temp;} 
    }
        
   // System.out.println(guys[0].evian());
   // System.out.println(gals[0].evian());
   // System.out.println(gals[1].evian());
   // System.out.println(gals[P-1].evian());
    int sum=0;
    for (int i=0; i<P; i++){
      if(gals[i].evian()){sum++;}
    }
    System.out.println("the number of evians is " + sum);
    
  }
}
    
    
    
    
  