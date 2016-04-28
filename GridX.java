public class GridX{
  
  static int D = 5;
  static int[][] grid = new int[D][D];
  static int[][] gridB = new int[D][D];
  static boolean[][] gridC = new boolean[D][D];
  static int total=0;
  
  public static void fill(double P){
    for(int i =0; i<D;i++){
      for(int j=0; j<D; j++){
        if(Math.random()<P){grid[i][j]=1;}
        else {grid[i][j]=0;}
      }}}
  
  
       
  public static void print( int[][] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
        System.out.print( arr[i][j] + " ");
      }
      System.out.print("\n");}}
    
  
  public static void main(String[] args){
    fill(0.5);
    print(grid);
    //print(gridB);
    //connect(1,1);
    System.out.println("-----------------");
    //print(gridB);
   
  
}
}