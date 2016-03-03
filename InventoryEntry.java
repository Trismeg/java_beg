public class InventoryEntry{
  
  String chemical_name;
  int cas_number;
  String building;
  String department;
  int room_number;
  int quantity;
  String unit;
  int[] nfpa_hfr;
  String[] hazards;
  boolean sara313;
  String link;
  String id_hash;
  
  public InventoryEntry( String chemical_name ){
    this.chemical_name = chemical_name;
  }
  
  public void setChemicalName(String s){this.chemical_name = s;}
  public void setCas(int i){this.cas_number = i;}
  public void setBuilding(String s){this.building = s;}
  public void setDepartment(String s){this.department = s;}
  public void setRoom(int i){this.room_number = i;}
  public void setQuantity(int i){this.quantity = i;}
  public void setUnit(String s){this.unit = s;}
  public void setNFPA(int[] i){this.nfpa_hfr = i;}
  public void setHazards(String[] s){this.hazards = s;}
  public void setSara(boolean b){this.sara313 = b;}
  public void setSara(String s){if(s.charAt(0)=='y'){this.sara313 = true;}}
  public void setLink(String s){this.link = s;}
  public void setId(String s){this.id_hash = s;}
  
  public String getChemicalName(){return this.chemical_name;}
  public int getCas(){return this.cas_number;}
  public String getBuilding(){return this.building;}
  public String getDepartment(){return this.department;}
  public int getRoom(){return this.room_number;}
  public int getQuantity(){return this.quantity;}
  public String getUnit(){return this.unit;}
  public int[] getNFPA(){return this.nfpa_hfr;}
  public String[] getHazards(){return this.hazards;}
  public boolean getSara(){return this.sara313;}
  public String getLink(){return this.link;}
  public String getId(){return this.id_hash;}   
  
  public String toString(){
    String haz = this.getHazards()[0];
    for (int i=1; i<this.getHazards().length; i++){
      haz = haz + "/" + this.getHazards()[i];} 
      
    return this.getChemicalName() + "," +
           this.getCas() + "," +
           this.getBuilding() + "," +
           this.getDepartment() + "," +
           this.getRoom() + "," +
           this.getQuantity() + "," +
           this.getUnit() + "," +
           this.getNFPA()[0] + "," +
           this.getNFPA()[1] + "," +
           this.getNFPA()[2] + "," +
           haz + "," +
           this.getSara() + "," +
           this.getLink() + "," +
           this.getId(); 
  }
           
  //This is our extractor method.  
  //It takes a string from a line of the csv and spawns a new inventory entry
  public static InventoryEntry entrySpawner(String line){
    
     //HERE WE ARE EXTRACTING THE ====CHEMICAL_NAME
                String thing;
                thing = line.substring(0,line.indexOf(",")); //this takes the first comma seperated field from the line and assigns it to "thing"
                //System.out.println(thing);//print "thing"
                InventoryEntry entry1 = new InventoryEntry(thing);//this uses the chemical name in "thing" to create a new InventoryEntry object 
                
                //HERE WE ARE EXTRACTING THE ====CAS#
                line = line.substring(line.indexOf(",")+1);//the new line is the old line without the leading field
                thing = line.substring(0,line.indexOf(","));//the new "thing" is the leading field of the first line
               // System.out.println(thing);//print cas#
                entry1.setCas(Integer.parseInt(thing.replaceAll("-","")));//take the hyphens out of the cas# and convert to integer
                
                //HERE WE ARE EXTRACTING THE ====BUILDING
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
               // System.out.println(thing);
                entry1.setBuilding(thing);
                
                //HERE WE ARE EXTRACTING THE ====DEPARTMENT
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                entry1.setDepartment(thing);
                
                //HERE WE ARE EXTRACTING THE ====ROOM
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                //System.out.println(thing);
                entry1.setRoom(Integer.parseInt(thing));//convert to integer
                
                //HERE WE ARE EXTRACTING THE ====QUANTITY
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                //System.out.println(thing);
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
                //System.out.println(thing);
                nfpa[0]=Integer.parseInt(thing);
                
                //HERE WE ARE EXTRACTING THE ====FLAMMABILITY
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                System.out.println(thing);
                nfpa[1]=Integer.parseInt(thing);
                
                //HERE WE ARE EXTRACTING THE ====REACTIVITY
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                //System.out.println(thing);
                nfpa[2]=Integer.parseInt(thing);
                
                //setting nfpa int[]
                entry1.setNFPA( nfpa );
                
                //HERE WE ARE EXTRACTING THE ====HAZARDS  
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
                //System.out.println(thing);
                String[] hazards = thing.split("/"); 
                entry1.setHazards(hazards);
                
                //HERE WE ARE EXTRACTING THE ====SARA313
                line = line.substring(line.indexOf(",")+1);
                thing = line.substring(0,line.indexOf(","));
               // System.out.println(thing);
                entry1.setSara(thing);
                
                //HERE WE ARE EXTRACTING THE ====MSDS-LINK
                line = line.substring(line.indexOf(",")+1);
               // System.out.println(line);
                entry1.setLink(line);
                
                return entry1;
  }
  
  
  
  
  
  public static void main(String[] args){
    InventoryEntry entry1 = new InventoryEntry( "potassium" );
    System.out.println(entry1.getChemicalName());
    System.out.println(entry1.getCas());
    System.out.println(entry1.getBuilding());
    System.out.println(entry1.getSara());
  }
  
}
  
  
  
  