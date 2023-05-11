package aldy;
public class Tayo {
    void x(String mobilType ){
        System.out.println("Merek Mobil \t:" + mobilType);
    }
    void x(String Warna, int JumlahRoda, String NoPlat){
        System.out.println("Warna Mobil \t:" + Warna);
        System.out.println("Jumlah Roda \t:" + JumlahRoda +  " Roda");
        System.out.println("Nomor Plat \t:" + NoPlat);    
    }
    void x(int Kecepatan, int Waktu){
        System.out.println("Kecepatan Mobil :" + Kecepatan + " KM/jam");
        System.out.println("Waktu \t:" + Waktu + " Jam");
        System.out.println("Hasil \t:" +(Kecepatan * Waktu) + " KM");
    }
}
