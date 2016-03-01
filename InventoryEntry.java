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
  
 
  
  public static void main(String[] args){
    InventoryEntry entry1 = new InventoryEntry( "potassium" );
    System.out.println(entry1.getChemicalName());
    System.out.println(entry1.getCas());
    System.out.println(entry1.getBuilding());
    System.out.println(entry1.getSara());
  }
  
}
  
  
  
  