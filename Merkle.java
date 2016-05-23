import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class Merkle{
  
  String[] dataset;
  
  public static String getSHA256(String data) {
        String result = null;
        try {
            MessageDigest dig = MessageDigest.getInstance("SHA-256");
            byte[] hash = dig.digest(data.getBytes("UTF-8"));
            return bytesToHex(hash); // make it printable
        }catch(Exception ex) {ex.printStackTrace();}
        return result;}
  
  public static  String  bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash);}
  
 
  
  
   public static void main(String[] args) {
        
     Scanner sn = new Scanner(System.in);
        System.out.print("Please enter data for which SHA256 is required:");
        String data = sn.nextLine();
        
        
        String hash = getSHA256(data);
        System.out.println("The SHA256 (hexadecimal encoded) hash is:"+hash);
    }
}