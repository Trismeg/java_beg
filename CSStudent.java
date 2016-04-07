public class CSStudent extends Student{
  
  private String laptop;
  
  public CSStudent(Gender gender, int age, String name, Grade grade, int room,
                   String laptop){
    super(gender, age, name, grade, room);
    this.laptop=laptop;}
  
  public String getLaptop(){return this.laptop;}
  
  public void intro(){
    System.out.println("Hey, my name is " + this.getName() + 
                       ". I have a " + this.getLaptop() +
                       " and I will hack you.");}
}