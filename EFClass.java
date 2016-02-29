public class EFClass{
  
  private EFStudent[] roster;
  private String teacher;
  private String subject;
  private int room;
  private int period;
  private int cap;
  private int enrolled;
  
  public EFClass(){
    this.roster = new EFStudent[0];
    this.teacher = new String( "Dr. Mahoney" );
    this.subject = new String( "Lunch" );
    this.room = 0;
    this.period = 0;
    int cap = 0;
    int enrolled = 0;}
  
  public EFClass(int num_students){
    this.roster = new EFStudent[num_students];
    this.teacher = new String( "Dr. Mahoney" );
    this.subject = new String( "Lunch" );
    this.room = 0;
    this.period = 0;
    this.cap = num_students;
    this.enrolled=0;
  }
  
  public EFClass(int num_students, String a_teacher){
    this.roster = new EFStudent[num_students];
    this.teacher = new String( a_teacher);
    this.subject = new String( "Lunch" );
    this.room = 0;
    this.period = 0;
    this.cap = num_students;
    this.enrolled=0;
  }
  
  public void setPeriod(int a_period){
    this.period = a_period;
  }
  
  public void setRoom(int a_room){
    this.room = a_room;
  }
  
  public void setSubject(String a_subject){
    this.subject = a_subject;
  }
  
  public void setTeacher(String a_teacher){
    this.teacher = a_teacher;
  }
  
  public void addStudent(EFStudent a_student){
  }
  
  
  
}
  