public class HelloLnkLoop{
  
  public static void main(String[] args){
    
    LnkLoop loop = new LnkLoop();
    loop.addLnk(new Lnk());
    System.out.println(loop.getiLnk(0));
    System.out.println(loop.getiLnk(1));
    System.out.println(loop.getiLnk(2));
    System.out.println(loop.getiLnk(3));
    loop.addLnk(new Lnk());
    System.out.println(loop.getiLnk(0));
    System.out.println(loop.getiLnk(1));
    System.out.println(loop.getiLnk(2));
    System.out.println(loop.getiLnk(3));
    System.out.println(loop.length);
  }}