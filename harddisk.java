package fskk;

public class harddisk {
    private String proizvodjac;
    private int kapacitet;

    public harddisk(String p, int k){
        this.proizvodjac = p;
        this.kapacitet = k;
    }

    public String dobaviImeHdd(){
        return ""+ this.proizvodjac + " " + this.kapacitet;
    }
}
