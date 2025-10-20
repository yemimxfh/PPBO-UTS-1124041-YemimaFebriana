package uts.models;

public class Mobil extends Kendaraan {

  
  public Mobil(BahanBakar bahanBakar, int kapasitasOrang, String nama) {
    super(bahanBakar, kapasitasOrang, nama, 4);
  }

  @Override
  public String getDetails() {
    return "bingung";
  }
  
 
}
