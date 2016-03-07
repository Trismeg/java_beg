import java.io.*;
import java.security.*;

class GenSig {

    public static void main(String[] args) {

        /* Generate a DSA signature */

        if (args.length != 1) {
            System.out.println("Usage: GenSig nameOfFileToSign");
        }
        else try {

        // the rest of the code goes here
          KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
          SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
          keyGen.initialize(1024, random);
          
          KeyPair pair = keyGen.generateKeyPair();
          PrivateKey priv = pair.getPrivate();
          PublicKey pub = pair.getPublic();
          
          //System.out.println(priv.toString());
          //System.out.println(pub.toString());
          
          Signature dsa = Signature.getInstance("SHA1withDSA", "SUN"); 
          dsa.initSign(priv);
          
          byte[] realSig = dsa.sign();
          
          /* save the signature in a file */
          FileOutputStream sigfos = new FileOutputStream("sig");
          sigfos.write(realSig);
          sigfos.close();
          
          /* save the public key in a file */
          byte[] key = pub.getEncoded();
          FileOutputStream keyfos = new FileOutputStream("suepk");
          keyfos.write(key);
          keyfos.close();
          
          

        } catch (Exception e) {
            System.err.println("Caught exception " + e.toString());
        }
    }
}