public class Student extends Person{
  
  public enum Grade{FRESHMAN, SOPHOMORE, JUNIOR, SENIOR};
  
  private Grade grade;
  private int room;
  
  public Student(Gender gender, int age, String name, Grade grade, int room){
    super(gender, age, name);
    this.grade = grade;
    this.room = room;}
 
  public Grade getGrade(){return this.grade;}
  public int getRoom(){return this.room;}
  
  public void intro(){
    System.out.println("Hello my name is " + this.getName() + ".  I am a student and I never sleep.");
  }
}