package fskk;

public class procesor {
    public String proizvodjac;
    public String model;
    public int brojJezgri;

    public procesor(String p, String m, int j){
        this.proizvodjac = p;
        this.model = m;
        this.brojJezgri = j;
    }

    public String dobaviImeProcesora(){
        return ""+this.proizvodjac+" "+this.model;
    }
}
