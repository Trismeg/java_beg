public class HelloDLnkLoop{
  
  public static void main(String[] args){
    
    DLnkLoop loop = new DLnkLoop();
    loop.addDLnk(new DLnk());
    System.out.println(loop.getiLnk(0));
    System.out.println(loop.getiLnk(1));
    System.out.println(loop.getiLnk(2));
    System.out.println(loop.getiLnk(3));
    loop.addDLnk(new DLnk());
    System.out.println(loop.getiLnk(0));
    System.out.println(loop.getiLnk(1));
    System.out.println(loop.getiLnk(2));
    System.out.println(loop.getiLnk(3));
    System.out.println(loop.length);
  }}