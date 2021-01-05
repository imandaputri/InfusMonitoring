public class Database {

    private String[][] data = {
        {"IGD","Fulan","30","Albumin","10 ml","Merah"}, 
        {"IGD","Alex","20","Ringerlaktat","85 ml","Hijau"}, 
        {"Operasi","Antonio","39","Dextran","70 ml","Hijau"},
        {"Opname 02","Nathalie","23","Saline","100 ml","Hijau"},
        {"ICU","Grace","15","Gelatin","0 ml","Merah"},
    };

    private static Database instance;
    private Database(){}

    public static Database getInstance()
    {
    if(instance == null)
      instance = new Database();
		
    return instance;
  }

  public String[][] getData(){
      return this.data;
  }

}