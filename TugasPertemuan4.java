package tugaspertemuan4;
public class TugasPertemuan4 {
    String Jenis;
    String Merek;
    String TahunPembuatan;
    int harga;
    
    TugasPertemuan4(){
    }
    
    TugasPertemuan4(String Jenis, String Merek, String TahunPembuatan, int harga){
    }

    
    
    void cetak(String Jenis,String Merek,String TahunPembuatan){
        System.out.println("Jenis HP: "+Jenis);
        System.out.println("Merek: "+Merek);
        System.out.println("Tahun Pembuatan: "+TahunPembuatan);
    }
    void setHarga (String harga){
        System.out.println("Harga Device :"+harga);
    }
    int pembayaran(int bayar) {
        harga = bayar;
        System.out.println("Total Biaya: "+harga);
        return bayar;
    }   
  
    }

 