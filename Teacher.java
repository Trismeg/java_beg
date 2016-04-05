public class Teacher extends Person{
  
  public enum Dept{MATH, SCIENCE, LANGUAGE, HUMANITIES, LITERATURE};
  public enum Degree{BA ,BS ,MA ,MS , PHD};
  
  private Dept dept;
  private Degree degree;
  
  public Teacher(Gender gender, int age, String name, Dept dept, Degree degree){
    super(gender, age, name);
    this.dept = dept;
    this.degree = degree;}
  
}