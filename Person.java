public class Person{
  
  public enum Gender{MALE, FEMALE};
  
  private Gender gender;
  private int age;
  private String name;
  
  public Person(Gender gender, int age, String name){
    this.gender = gender;
    this.age = age;
    this.name = name;
  }
  
  public Gender getGender(){return this.gender;}
  public int getAge(){return this.age;}
  public String getName(){return this.name;}
  
  public void intro(){
    System.out.println("Hello my name is " + this.getName());}
  
  
}
  