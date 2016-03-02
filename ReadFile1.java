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
                
                //HERE WE ARE EXTRACTING THE ====CHEMICAL_NAME
                line = input.nextLine(); //this takes the next line from the csv file
                thing = line.substring(0,line.indexOf(",")); //this takes the first comma seperated field from the line and assigns it to "thing"
                System.out.println(thing);//print "thing"
                InventoryEntry entry1 = new InventoryEntry(thing);//this uses the chemical name in "thing" to create a new InventoryEntry object 
                
                //HERE WE ARE EXTRACTING THE ====CAS#
                line = line.substring(line.indexOf(",")+1);//the new line is the old line without the leading field
                thing = line.substring(0,line.indexOf(","));//the new "thing" is the leading field of the first line
                System.out.println(thing);//print cas#
                entry1.setCas(Integer.parseInt(thing.replaceAll("-","")));//take the hyphens out of the cas# and convert to integer
                
                //HERE WE ARE EXTRACTING THE ====BUILDING
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setBuilding(thing);
                
                //HERE WE ARE EXTRACTING THE ====DEPARTMENT
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setDepartment(thing);
                
                //HERE WE ARE EXTRACTING THE ====ROOM
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setRoom(Integer.parseInt(thing));//convert to integer
                
                //HERE WE ARE EXTRACTING THE ====QUANTITY
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setQuantity(Integer.parseInt(thing));
                
                //HERE WE ARE EXTRACTING THE ====UNIT
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setUnit(thing);
                
                //initializing the NFPA [health,flammability,reactivity] array
                int[] nfpa = new int[3];
                
                //HERE WE ARE EXTRACTING THE ====HEALTH
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                nfpa[0]=Integer.parseInt(thing);
                
                //HERE WE ARE EXTRACTING THE ====FLAMMABILITY
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                nfpa[1]=Integer.parseInt(thing);
                
                //HERE WE ARE EXTRACTING THE ====REACTIVITY
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                nfpa[2]=Integer.parseInt(thing);
                
                //setting nfpa int[]
                entry1.setNFPA( nfpa );
                
 //This code needs work
                //HERE WE ARE EXTRACTING THE ====HAZARDS  
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                String[] hazards = new String[1];
                hazards[0]=thing;
                entry1.setHazards(hazards);
                
                //HERE WE ARE EXTRACTING THE ====SARA313
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setSara(thing);
                
                //HERE WE ARE EXTRACTING THE ====MSDS-LINK
                line = line.substring(line.indexOf(",")+1);
                System.out.println(line);
                entry1.setLink(line);
                
                
                //PRINTING ALL THE FIELDS
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