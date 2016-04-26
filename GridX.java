public class GridX{
  
  static int D = 20;
  static int[][] grid = new int[D][D];
  
  public static void fill(double P){
    for(int i =0; i<D;i++){
      for(int j=0; j<D; j++){
        if(Math.random()<P){grid[i][j]=1;}
        else {grid[i][j]=0;}
      }}}
  
  public static void main(String[] args){
    fill(0.33);
}
}