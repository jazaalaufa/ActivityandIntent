package com.example.app_tugas4;


import java.io.Serializable;

public class Jenis implements Serializable {
    String hargaMakanan,hargaMinuman,hargaSouvenir,hargaPakaian;

    public String getHargaMakanan(){return hargaMakanan;}
    public String getHargaMinuman() {return hargaMinuman;}
    public  String getHargaSouvenir() { return hargaSouvenir;}
    public String getHargaPakaian() {return hargaPakaian;}

    public void setHargaMakanan(String harga) {this.hargaMakanan=harga;}
    public void setHargaMinuman(String harga)  {this.hargaMinuman=harga;}
    public void setHargaSouvenir (String harga) {this.hargaSouvenir=harga;}
    public void setHargaPakaian(String harga) {this.hargaPakaian=harga;}

}
