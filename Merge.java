public class Merge{
 
  public static void doIt(int[] a, int beg, int end){
    if(beg<end){
      int mid = (beg+end)/2;
      doIt(a, beg, mid);
      doIt(a, mid+1, end);
      merge( a, beg, mid, end);}}
      
  public static void merge(int[] a, int beg, int mid, int end){
    int[] temp = new int[end-beg+1];
    int i1=beg;
    int i2=mid+1;
    int i=0;
    
    while( i1<=mid && i2<=end ){
      if( a[i1]<a[i2] ){
        temp[i] = a[i1];
        i1++;}
      else{
        temp[i]=a[i2];
        i2++;}
      i++;}
    
    while( i1<=mid ){
      temp[i]=a[i1];
      i1++;
      i++;}
    
    while( i2<=end ){
      temp[i]=a[i2];
      i2++;
      i++;}
    
    for( i=0; i<temp.length; i++){
      a[beg + i] = temp[i];}}
  
  public static void mergeSort( int[] a ){
    doIt(a, 0, a.length-1);}

  public static void main(String[] args){
    
    int[] numbs={5,2,3,4,8,9,1,4};
    
    for(int n=0; n<numbs.length; n++){
      System.out.print(numbs[n] + " ");}
    System.out.println(" ");
    
    mergeSort(numbs);
    
    for(int n=0; n<numbs.length; n++){
      System.out.print(numbs[n] + " ");}
  }
  
  }
      