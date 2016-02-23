public class EFStudent{
  
  private String name;
  private int id_num;
  private String grade;
  
  public EFStudent(){
    this.name = new String("Jow Blow");
    this.id_num = -1;
    this.grade = new String("enrolled");
  }
  
  public EFStudent( String a_name ){
   this.name=new String(a_name); 
   this.id_num = -1;
   this.grade = new String("enrolled");
  }
  
  public EFStudent( int an_id ){
   this.name=new String("Jow Blow"); 
   this.id_num = an_id;
   this.grade = new String("enrolled");
  }
  
  public EFStudent( String a_name, int an_id ){
   this.name=new String( a_name ); 
   this.id_num = an_id;
   this.grade = new String("enrolled");
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setName(String a_name){
    this.name = a_name;
  }
  
  public int getID(){
    return this.id_num;
  }
  
  public void setID( int an_id){
    this.id_num = an_id;
  }
  
  public String getGrade(){
    return this.grade;
  }
  
  public void intro(EFStudent other){
   System.out.println("Hello "+ other.getName() +other.getID()+ ".  My name is " + this.getName() +this.getID()); 
  }
}
  