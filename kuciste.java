package fskk;

import java.util.HashMap;

public class kuciste {
    private String naziv;
    private int serijskiBroj;
    private procesor procesor;
    HashMap<Integer, graficka> graficke = new HashMap<>();
    HashMap<Integer, ram> ramovi = new HashMap<>();
    HashMap<Integer, harddisk> hddovi = new HashMap<>();

    public kuciste(String naziv, int broj, procesor procesor){
        this.naziv = naziv;
        this.serijskiBroj = broj;
        this.procesor = procesor;
    }

    public void dodajGrafu(Integer brojGrafe, graficka grafa){
        graficke.put(brojGrafe, grafa);
    }
    public void ispisiGrafe(){
        System.out.println("Graficke u kucistu " + this.naziv + ":");
        for(Integer i: graficke.keySet()){
            System.out.println(graficke.get(i).dobaviImeGraficke());
        }
    }
    public void dodajRam(Integer brojRama, ram ram){
        ramovi.put(brojRama, ram);
    }

    public void ispisRamova(){
        System.out.println("Ramovi u kucistu " + this.naziv + ":");
        for(ram r: ramovi.values()){
            System.out.println(r.dobaviImeRama());
        }
    }

    public void dodajHDD(Integer brojHDDa, harddisk hdd){
        hddovi.put(brojHDDa, hdd);
    }

    public void ispisHDD(){
        System.out.println("HDDovi u kucistu " + this.naziv + ":");
        for(Integer i: hddovi.keySet()){
            System.out.println(hddovi.get(i).dobaviImeHdd());
        }
    }

    public void ispisSvega(kuciste k){
        System.out.println("Specifikacije kucista " + this.naziv +":");
        System.out.println("Procesor: " + k.procesor.dobaviImeProcesora());
        k.ispisiGrafe();
        k.ispisRamova();
        k.ispisHDD();
    }

    public String toString(){
        return "Kuciste " + this.naziv + " " + this.procesor.dobaviImeProcesora();
    }
}
