package fskk;

public class ram {
    private String proizvodjac;
    private int kapacitet;

    public ram(String p, int k){
        this.proizvodjac = p;
        this.kapacitet = k;
    }

    public String dobaviImeRama(){
        return ""+ this.proizvodjac + " " + this.kapacitet;
    }
}
