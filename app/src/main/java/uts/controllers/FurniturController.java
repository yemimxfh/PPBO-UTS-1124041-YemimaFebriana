package uts.controllers;

import java.util.ArrayList;
import java.util.List;

import uts.models.BahanUtama;
import uts.models.Furnitur;
import uts.models.Kursi;
import uts.models.Meja;
import uts.models.MejaLipat;
import uts.models.Sofa;




public class FurniturController {
    List<Furnitur> furnitures;

  public FurniturController() {
    this.furnitures = new ArrayList<>();
  }

  // kursi
  public void addFurnitur(BahanUtama bahanUtama, double berat, boolean adaSandaran) {
    this.furnitures.add(new Kursi(bahanUtama, berat, adaSandaran));
  }

  // meja
  public void addFurnitur(BahanUtama bahanUtama, double berat, int jumlahLaci) {
    this.furnitures.add(new Meja(bahanUtama, berat, jumlahLaci));
  }

  // meja lipat
  public void addFurnitur(BahanUtama bahanUtama, double berat) {
    this.furnitures.add(new MejaLipat(bahanUtama, berat));
  }

  // sofa
  public void addFurnitur(BahanUtama bahanUtama, double berat, int jumlahDudukanAtauLaci, boolean isSofa) {
    if (isSofa) {
      this.furnitures.add(new Sofa(bahanUtama, berat, jumlahDudukanAtauLaci));
    } else {
      this.addFurnitur(bahanUtama, berat, jumlahDudukanAtauLaci);
    }
  }

  public List<Furnitur> getAll() {
    return this.furnitures;
  }

}
