import java.io.File;
import java.util.Scanner;

public class ReadFile1 {

    public static void main(String[] args) {

        try {
            //Scanner input = new Scanner(System.in);
            //System.out.print("Enter the file name with extention : ");
            //File file = new File(input.nextLine());
 
            File file = new File("inventory.csv");
            
            Scanner input = new Scanner(file);

                String line = input.nextLine();
                line = input.nextLine();
                line = input.nextLine();
                line = input.nextLine();
                System.out.println(line);
                System.out.println(line.indexOf(","));
                System.out.println(line.substring(0,12));
                System.out.println(line.substring(13));
                line = line.substring(13);
                System.out.println(line.substring(0,line.indexOf(",")));
                
                
                
                //line = input.nextLine();
                //System.out.println(line);
                //System.out.println(input.findInLine("'"));
            
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}