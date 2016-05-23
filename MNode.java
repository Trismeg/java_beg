import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class MNode{
  
  String pay;
  MNode left;
  MNode right;
  
  public MNode(){};
  
  public MNode(String pay){
    this.pay=pay;}
  
  
  public static String sha256(String data) {
        String result = null;
        try {
            MessageDigest dig = MessageDigest.getInstance("SHA-256");
            byte[] hash = dig.digest(data.getBytes("UTF-8"));
            return bytesToHex(hash); // make it printable
        }catch(Exception ex) {ex.printStackTrace();}
        return result;}
  
  public static String  bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash);}
  
  public String sha256(){
    return sha256(this.pay);}
  
  public static MNode[] evenize(MNode[] input){
    if(input.length%2==0){return input;}
    else{
      MNode[] output = new MNode[input.length+1];
      for(int i=0; i<input.length; i++){
        output[i]=input[i];}
      output[input.length]=output[input.length-1];
      return output;}}
  
  public MNode merge(MNode other){
    MNode output = new MNode(sha256(this.pay+other.pay));
    output.left=this;
    output.right=other;
    return output;}
  
  public static MNode[] merkle(String[] words){
    MNode[] output = new MNode[words.length];
    for(int i=0; i<words.length; i++){
       output[i]=new MNode(sha256(words[i]));}
    return merkle(output);}
  
  public static MNode[] merkle(MNode[] hashes){
    if(hashes.length==1){return hashes;}
    else{
      MNode[] even = evenize(hashes);
      MNode[] up = new MNode[even.length/2];
      for(int i=0; i<up.length; i++){
        up[i]=even[2*i].merge(even[2*i+1]);}
      return merkle(up);}}
      
       
   public static void main(String[] args) {
        String[] test = new String[7];
        test[0]="hi";
        test[1]="hiya";
        test[2]="ho";
        test[3]="hey";
        test[4]="hu";
        test[5]="ih";
        test[6]="hy";
        
        String merk = merkle(test)[0].pay;       
        System.out.println(merk);

    }
}