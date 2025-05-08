/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo2;


public class Mahasiswa {
    
    private String nama;
    private String nim;
    private String prodi;
    private String fakultas;
    private int tahunMasuk;
    
    public Mahasiswa(String nama, String nim, String prodi, String fakultas, int tahunMasuk) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.tahunMasuk = tahunMasuk;
    }
    
   
    public String tampilkanBiodata() {
        return "Biodata Mahasiswa:\n" +
               "Nama: " + nama + "\n" +
               "NIM: " + nim + "\n" +
               "Program Studi: " + prodi + "\n" +
               "Fakultas: " + fakultas + "\n" +
               "Tahun Masuk: " + tahunMasuk;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getProdi() {
        return prodi;
    }
    
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public String getFakultas() {
        return fakultas;
    }
    
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    public int getTahunMasuk() {
        return tahunMasuk;
    }
    
    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
}
