package uts.controllers;

import java.util.ArrayList;
import java.util.List;

import uts.models.BahanBakar;
import uts.models.Helikopter;
import uts.models.Kendaraan;
import uts.models.Mobil;
import uts.models.Pesawat;
import uts.models.Truk;

public class KendaraanController {
  List<Kendaraan> kendaraanKendaraan;

  public KendaraanController() {
    this.kendaraanKendaraan = new ArrayList<>();
  }

  // mobil
  public void addKendaraan(BahanBakar bahanBakar, int kapasitasOrang, String nama) {
      this.kendaraanKendaraan.add(new Mobil(bahanBakar, kapasitasOrang, nama));
  }

  // pesawat
  public void addKendaraan(int kapasitasOrang, String nama, int jumlahRoda, boolean isPesawatTempur) {
    this.kendaraanKendaraan.add(new Pesawat(kapasitasOrang, nama, jumlahRoda, isPesawatTempur));
  }

  // helikopter
  public void addKendaraan(int kapasitasOrang, String nama, int jumlahBalingBaling) {
    this.kendaraanKendaraan.add(new Helikopter(kapasitasOrang, nama, jumlahBalingBaling));
  }
  // truk
  public void addKendaraan(String nama, int jumlahRoda) {
    this.kendaraanKendaraan.add(new Truk(nama, jumlahRoda));
  }

  public List<Kendaraan> getAll() {
    return this.kendaraanKendaraan;
  }

}
