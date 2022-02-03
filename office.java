package fskk;

import java.util.HashMap;

public class office {
    public int brojKancelarije;
    HashMap<Integer, kuciste> racunari = new HashMap<>();

    public office(int broj){
        this.brojKancelarije = broj;
    }

    public void dodajKuciste (Integer brojKucista, kuciste k){
        racunari.put(brojKucista,k);
    }
    public void ispisiKucista(){
        System.out.println("Kucista u kancelariji " + this.brojKancelarije +":\n");
        for (Integer x:racunari.keySet()){
            racunari.get(x).ispisSvega(racunari.get(x));
        }
    }
}
