package uts.models;

public class Helikopter extends Kendaraan {
    private int jumlahBalingBaling;

    public int getJumlahBalingBaling() {
        return jumlahBalingBaling;
    }

    public Helikopter(int kapasitasOrang, String nama, int jumlahBalingBaling) {
        super(BahanBakar.AVTUR, kapasitasOrang, nama, 0);
        this.jumlahBalingBaling = jumlahBalingBaling;
    }

    @Override
    public String getDetails() {
        return  "Jumlah Baling-Baling: " + jumlahBalingBaling ;
    }

    
    

}
