package uts.models;

public class Pesawat extends Kendaraan implements Kargoable {
  private boolean isPesawatTempur;

  public Pesawat( int kapasitasOrang, String nama, int jumlahRoda, boolean isPesawatTempur) {
    super(BahanBakar.AVTUR, kapasitasOrang, nama, jumlahRoda);
    this.isPesawatTempur = isPesawatTempur;
  }

  public boolean getIsPesawatTempur() {
    return isPesawatTempur;
  }

  @Override
  public String getDetails() {
    return "Gatauisinya bingung";
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
