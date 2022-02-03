package fskk;


public class Gejmersko extends kuciste {
    private int boja;
    public Gejmersko(String naziv, int serijski, procesor procesor, int boja){
        super(naziv, serijski, procesor);
        this.boja = boja;
    }

   public String toString(){
        return super.toString() + " kuciste gejmersko " + this.boja;
   }
}
