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
  
  public String getChemicalName(){
    return this.chemical_name;
  }
  
  public static void main(String[] args){
    InventoryEntry entry1 = new InventoryEntry( "Sodium" );
    System.out.println(entry1.getChemicalName());
  }
  
}
  
  
  
  