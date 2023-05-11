package com.mycompany.mobil;

public class Mobil {

    protected String jenis;
    protected String merk;
    protected int tahunproduksi;
    
    public Mobil(String jenis,String merk,int tahunproduksi){
        this.jenis = jenis;
        this.merk = merk;
        this.tahunproduksi = tahunproduksi;
    }
    public void Info(){
        System.out.println("Jenis mobil: " + jenis);
        System.out.println("Merk mobil; " + merk );
        System.out.println("Tahun produksi; " + tahunproduksi);
    }
    public final void Dijual(){
        System.out.println("Mobiil Ini Dijual");
    }
    
}
 class Sedan extends Mobil{
    private int kapasitasMesin;

    
    Sedan(String jenis, String merk, int tahunproduksi, int  cc){
        super(jenis, merk, tahunproduksi);
    }
    
    public void Info(int harga){
    System.out.println("kapasitasMesin: " + kapasitasMesin + "cc");
    System.out.println("Harga: " + harga);
    }
    public void dijual(String alamat){
        super.Dijual();
        System.out.println("Alamat penjualan : " + alamat);
    }

    
    
   
 
 }


