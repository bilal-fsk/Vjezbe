package fskk;

public class graficka {
    public String proizvodjac;
    public String model;
    public int memorija;

    public graficka(String p, String m, int mem){
        this.proizvodjac = p;
        this.model = m;
        this.memorija = mem;
    }

    public String dobaviImeGraficke(){
        return ""+this.proizvodjac+" "+this.model;
    }
}
