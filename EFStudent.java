public class EFStudent{
  
  private String name;
  public int id_num;
  private String grade;
  
  
  public EFStudent( String a_name ){
   this.name=new String(a_name); 
   this.id_num = -1;
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
}
  