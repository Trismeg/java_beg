public class IfElseStatements8{
  
  public static void main(String[] args){
    int score =20;
    String grade;
    
    
    if ( score >= 90 ){grade = new String("A");}
    else{if ( score >= 80 ){grade = new String("B");}
      else{if ( score >= 70 ){grade = new String("C");}
        else{if ( score >= 60 ){grade = new String("D");}
          else{grade = new String("F");}
        }
      }
    }
      
    
    
    
    
    System.out.println("the grade is " + grade);
    
  }
}