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
    
  }
}