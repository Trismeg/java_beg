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
            
            String thing;
            
            int startline = 6;
            int endline = 8;
            InventoryEntry[] inventory = new InventoryEntry[endline - startline +1];
            
                String line;
                for(int i=0; i< startline - 1 ; i++){
                line = input.nextLine();}
                
                for(int i=0; i<inventory.length ; i++){  
                  line = input.nextLine();
                inventory[i] = InventoryEntry.entrySpawner(line);}
                
                /* PRINTING ALL THE FIELDS
                System.out.println(entry1.getChemicalName());
                System.out.println(entry1.getCas());
                System.out.println(entry1.getBuilding());
                System.out.println(entry1.getDepartment());
                System.out.println(entry1.getQuantity());
                System.out.println(entry1.getUnit());
                System.out.println(entry1.getNFPA()[0] +" "+entry1.getNFPA()[1]+" "+entry1.getNFPA()[2]);
                System.out.println(entry1.getHazards()[0]);
                System.out.println(entry1.getSara());
                System.out.println(entry1.getLink());
                */
                
                for (int i=0; i<inventory.length; i++){
                  System.out.println(inventory[i].toString());}
                
                
                
                //line = input.nextLine();
                //System.out.println(line);
                //System.out.println(input.findInLine("'"));
            
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}