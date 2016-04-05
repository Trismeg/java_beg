public class Student extends Person{
  
  public enum Grade{FRESHMAN, SOPHMORE, JUNIOR, SENIOR};
  
  private Grade grade;
  private int room;
  
  public Student(Gender gender, int age, String name, Grade grade, int room){
    super(gender, age, name);
    this.grade = grade;
    this.room = room;}
 
  public Grade getGrade(){return this.grade;}
  public int getRoom(){return this.room;}
  
}