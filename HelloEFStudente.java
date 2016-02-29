public class HelloEFStudente{
  
  public static void main(String[] args){
    
    EFStudente student1 = new EFStudente( "Anthony Lin" );
    System.out.println("The student is named " + student1.getName() + " and the ID# is " + student1.getID());
    student1.setID( 12345 );
    System.out.println("The student is named " + student1.getName() + " and the ID# is " + student1.getID());
    student1.setName( "Tony Lin");
    System.out.println("The student is named " + student1.getName() + " and the ID# is " + student1.getID());
    student1.creds();
    
    EFStudente student2 = new EFStudente( "Jan Kamburg" );
    student2.intro(student1);
    student1.intro(student2);
    
    EFStudente[] cs17 = new EFStudente[11];
    for(int i=0; i<cs17.length; i++){
      cs17[i] = new EFStudente(1000+i );}
    
   // for(int i=0; i<cs17.length; i++){
   //   cs17[i].intro(cs17[(i+1)% cs17.length ]);}
    
    for(int i=0; i<cs17.length; i++){
      for(int j=0; j<cs17.length; j++){
        if(!(i==j)){cs17[i].intro(cs17[j]);}
      }}
    
    
  }
}