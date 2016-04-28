public class GridX{
  
  static int D = 10;
  static int[][] grid = new int[D][D];
  static int x=3;
  static int y=5;
  static int[][] gridB = new int[D][D];
  static boolean[][] gridC = new boolean[D][D];
  static int total=0;
  
  public static void fill(double P){
    for(int i =0; i<D;i++){
      for(int j=0; j<D; j++){
        if(Math.random()<P){grid[i][j]=1;}
        else {grid[i][j]=0;}
      }}}
  
  public static void connect(int a, int b){
    if((a<0 | a>(D-1))|(b<0 | b>(D-1))){}
    else if(gridC[a][b]){}
    else if(grid[a][b]==0){gridC[a][b]=true;}
    else {
      total=total+1;
      gridB[a][b]=1;
      connect(a-1,b); connect(a+1,b); connect(a,b-1); connect(a,b+1);
    }}
      
  public static void print( int[][] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
        System.out.print( arr[i][j] + " ");
      }
      System.out.print("\n");}}
    
  
  public static void main(String[] args){
    fill(0.33);
    print(grid);
    print(gridB);
    connect(x,y);
    print(gridB);
    
  
}
}