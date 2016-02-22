public class HelloEFStudent{
  
  public static void main(String[] args){
    
    EFStudent student1 = new EFStudent( "Lawrence To" );
    System.out.println(student1.getName() + " has the student ID number " + student1.getID());
    student1.setID( 12345 );
    System.out.println(student1.getName() + " has the student ID number " + student1.getID());
    student1.setName( "Han To" );
    System.out.println(student1.getName() + " has the student ID number " + student1.getID());
    System.out.println(student1.getName() + " has the student ID number " + student1.id_num);
  }
  
}