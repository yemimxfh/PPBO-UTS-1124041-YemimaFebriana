package uts.views;

import java.util.List;

import uts.controllers.KendaraanController;
import uts.models.Kendaraan;
import uts.utils.CLIUtil;

public class KendaraanView {

  private KendaraanController kendaraanController;

  public KendaraanView() {
    this.kendaraanController = new KendaraanController();
  }

  public void render() {
    this.printMenu();
    int menu = CLIUtil.getInt();
    while (menu != 0) {
      switch (menu) {
        case 1:
          this.handleTambahKendaraan();
          break;
        case 2:
          this.handlePrintKendaraan();
          break;
        case 3:
          this.handleSortKendaraan();
          break;
        case 0:
          return;
      }
      this.printMenu();
      menu = CLIUtil.getInt();
    }
  }

  private void printMenu() {
    System.out.println("Menu:");
    System.out.println("1. Tambah kendaraan");
    System.out.println("2. Tampilkan semua kendaraan");
    System.out.println("3. Urutkan kendaraan berdasarkan kapasitas");
    System.out.println("0. Keluar");
  }

  private int getMenuKendaraan() {
    System.out.println("\"Masukkan nama kendaraan: \"");
    System.out.println("    1. Mobil");
    System.out.println("    2. Truk");
    System.out.println("    3. Pesawat");
    System.out.println("    4. Helikopter");
    System.out.print("    Your choice: ");
    return CLIUtil.getInt();
  }

  private void handleTambahKendaraan() {

    int tipe = getMenuKendaraan();
    System.out.println("masukkan nama: ");
    String nama = CLIUtil.getString();

    switch (tipe) {
      case 1:
        kendaraanController.addKendaraan(null, tipe, nama);
        break;
      case 2:
        kendaraanController.addKendaraan(nama, tipe);
        break;
      case 3:
      System.out.println("jumlah roda: ");
      int jumlahRoda =
      kendaraanController.addKendaraan(, nama, tipe, false);;
        break;
      case 4:
        break;
    }
  }

  private void handlePrintKendaraan() {
    List<Kendaraan> kendaraanKendaraan = this.kendaraanController.getAll();
    for (int i = 0; i < kendaraanKendaraan.size(); i++) {
      Kendaraan kendaraan = kendaraanKendaraan.get(i);
      System.out.println((i + 1) + kendaraan.getNama() + ", kapasitas orang: " + kendaraan.getKapasitasOrang()
          + " Jumlah Roda " + kendaraan.getJumlahRoda() + "kg");
    }
  }

  private void handleSortKendaraan() {

  }
}