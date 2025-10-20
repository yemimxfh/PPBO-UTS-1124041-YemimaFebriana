package uts.models;

enum KendaraanName {
  MOBIL,
  TRUK,
  PESAWAT,
  HELIKOPTER
}

public abstract class Kendaraan {
  private KendaraanName kendaraanName;
  private BahanBakar bahanBakar;
  private int kapasitasOrang;
  private String nama;
  private int jumlahRoda;


  public Kendaraan(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahRoda) {
    this.bahanBakar = bahanBakar;
    this.kapasitasOrang = kapasitasOrang;
    this.nama = nama;
    this.jumlahRoda = jumlahRoda;
  }

  public int getKapasitasOrang() {
    return kapasitasOrang;
  }

  public String getNama() {
    return getKendaraanNameString() + nama;
  }

  public BahanBakar getBahanBakar() {
    return this.bahanBakar;
  }

  public String getBahanBakarString() {
    switch (this.bahanBakar) {
      case BENSIN:
        return "Bensin";
      case DIESEL:
        return "Diesel";
      case AVTUR:
        return "Avtur";
    }
    return "Entah";
  }

   public KendaraanName getName() {
    return this.kendaraanName;
  }

  public String getKendaraanNameString() {
    switch (kendaraanName) {
      case MOBIL:
        return "Mobil";
      case TRUK:
        return "Truk";
      case PESAWAT:
        return "Pesawat";
      case HELIKOPTER:
        return "Helikopter";
      default:
        return "Unknown";
    }
  }

  public abstract String getDetails();

  public int getJumlahRoda() {
    return jumlahRoda;
  }

}
