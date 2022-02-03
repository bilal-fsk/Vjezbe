package fskk;

public class Main {

    public static void main(String[] args) {
        harddisk HDD1 = new harddisk("Kingston", 512);
        harddisk HDD2 = new harddisk("Toshiba", 1024);
        harddisk HDD3 = new harddisk("Logitech", 128);

        ram r1 = new ram("Kinston", 8);
        ram r2 = new ram("Logitec", 4);
        ram r3 = new ram("Razor", 2);
        ram r4 = new ram("Star", 16);

        graficka g1 = new graficka("AMD", "rx580", 6);
        graficka g2 = new graficka("Integrisana", "I", 1);
        graficka g3 = new graficka("Intel", "TI1060", 4);
        graficka g4 = new graficka("AMD", "rx 5500 XT", 8);
        graficka g5 = new graficka("AMD", "ATI RADEON HD 5450", 2);
        graficka g6 = new graficka("NVIDIA", "G3060", 12);

        procesor p1 = new procesor("Intel", "i9", 16);
        procesor p2 = new procesor("AMD", "Ryzen 3600", 12);
        procesor p3 = new procesor("Intel", "i5", 8);
        procesor p4 = new procesor("AMD", "Threadripper", 200);

        kuciste k1 = new kuciste("Aquarius", 8934, p4);
        kuciste k2 = new kuciste("MS OS", 1243, p3);
        kuciste k3 = new kuciste("Krntija", 2345, p1);
        kuciste k4 = new kuciste("Krtina UUU", 6243, p2);


        office o1 = new office(67);
        office o2 = new office(69);

        k1.dodajGrafu(1,g6);
        k2.dodajGrafu(1,g3);
        k3.dodajGrafu(1,g1);
        k3.dodajGrafu(2,g2);
        k4.dodajGrafu(1,g4);
        k4.dodajGrafu(2,g5);
        k1.dodajGrafu(2,g4);

        k1.dodajRam(1,r4);
        k1.dodajRam(2,r4);
        k2.dodajRam(1,r2);
        k2.dodajRam(2,r3);
        k3.dodajRam(1,r3);
        k4.dodajRam(1,r1);

        k1.dodajHDD(1,HDD1);
        k2.dodajHDD(1,HDD1);
        k3.dodajHDD(1,HDD2);
        k3.dodajHDD(2,HDD3);
        k4.dodajHDD(1,HDD2);

        o1.dodajKuciste(1,k3);
        o1.dodajKuciste(2,k1);
        o2.dodajKuciste(1, k2);
        o2.dodajKuciste(2, k3);
        o2.dodajKuciste(3, k4);

        o1.ispisiKucista();
        o2.ispisiKucista();

        k3.ispisiGrafe();

        kuciste k5 = new Gejmersko("aquarius", 2, p1, 3);
        System.out.println(k2);
        System.out.println(k5);

    }
}
