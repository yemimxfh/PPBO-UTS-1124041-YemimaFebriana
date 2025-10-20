package uts.models;

public class Truk extends Kendaraan implements Kargoable {

  

  public Truk(String nama, int jumlahRoda) {
    super(BahanBakar.DIESEL, 3, nama, jumlahRoda);
  }

  @Override
  public String getDetails() {
    return "bingung";
  }

  @Override
  public void loadKargo() {
    System.out.println("");
  }

  @Override
  public void unloadKargo() {
    System.out.println("");
  }
    


}
