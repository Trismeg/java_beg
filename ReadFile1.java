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
            
                String line = input.nextLine();
                line = input.nextLine();
                line = input.nextLine();
                
                line = input.nextLine();
                //System.out.println(line);
                //System.out.println(line.indexOf(","));
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                InventoryEntry entry1 = new InventoryEntry(thing);
                //System.out.println(line.substring(line.indexOf(",")+1));
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setCas(Integer.parseInt(thing.replaceAll("-","")));
                
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setBuilding(thing);
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setDepartment(thing);
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setRoom(Integer.parseInt(thing));
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setQuantity(Integer.parseInt(thing));
                
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setUnit(thing);
                
                int[] nfpa = new int[3];
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                nfpa[0]=Integer.parseInt(thing);
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                nfpa[1]=Integer.parseInt(thing);
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                nfpa[2]=Integer.parseInt(thing);
                
                entry1.setNFPA( nfpa );
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                String[] hazards = new String[1];
                hazards[0]=thing;
                entry1.setHazards(hazards);
                
                
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setSara(thing);
                
                line = line.substring(line.indexOf(",")+1);
                System.out.println(line);
                entry1.setLink(line);
                
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
                
                
                
                
                //line = input.nextLine();
                //System.out.println(line);
                //System.out.println(input.findInLine("'"));
            
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}