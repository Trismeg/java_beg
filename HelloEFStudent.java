public class HelloEFStudent{
  
  public static void main(String[] args){
    
    EFStudent student1 = new EFStudent( "Lawrence To" );
    System.out.println(student1.getName() + " has the student ID number " + student1.getID());
    student1.setID( 12345 );
    System.out.println(student1.getName() + " has the student ID number " + student1.getID());
    student1.setName( "Han To" );
    System.out.println(student1.getName() + " has the student ID number " + student1.getID());
    
    EFStudent student2 = new EFStudent( "Ohiz Ojo", 7);
    student2.intro(student1);
    
    EFStudent[] cs101 = new EFStudent[21];
    for(int i=0; i<cs101.length ; i++){
      cs101[i] = new EFStudent(1000+i);
    }
    
    System.out.println("the 10th sudent is " + cs101[9].getName() + " with id# "+ cs101[9].getID());
    
    for(int i=0; i<cs101.length; i++){
      cs101[i].intro(cs101[(i+1)%21]);
      cs101[(i+1)%21].intro(cs101[i]);}
    
  }
  
}