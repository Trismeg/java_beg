public class HelloPeople{
  
  public static void main(String[] args){
    
    Person shmo = new Person(Person.Gender.MALE, 30, "Joe Guy");
    shmo.intro();
    
    Student joan = new Student(Person.Gender.FEMALE, 17, "Joanna Newt", 
    Student.Grade.JUNIOR, 301);
    joan.intro();
    
    CSStudent sherm = new CSStudent(Person.Gender.FEMALE, 11, "Sharon Shane",
                                    Student.Grade.SOPHOMORE, 302, "PC");
    sherm.intro();
  }
  
}